let latLonArray = [];
let LonCenter;
let LatCenter;

mapboxgl.accessToken = 'pk.eyJ1Ijoic29sZW1uIiwiYSI6ImNsZmlvbDBibjBrNTg0M25taG1xM2x2YXIifQ.aiMQpTd20YpCaWJfL5BmIg';
var map = new mapboxgl.Map({
    container: 'map',
    style: 'mapbox://styles/mapbox/streets-v11',
    center: [-48.63, -22.50],
    zoom: 6
});

function enviarDados() {

    var lat_str = document.getElementById("lat_str").value;
    var lon_str = document.getElementById("lon_str").value;
    var lat_end = document.getElementById("lat_end").value;
    var lon_end = document.getElementById("lon_end").value;
    var mbr_lat_str = document.getElementById("mbr_lat_str").value;
    var mbr_lon_str = document.getElementById("mbr_lon_str").value;
    var mbr_lat_end = document.getElementById("mbr_lat_end").value;
    var mbr_lon_end = document.getElementById("mbr_lon_end").value;


    const URL = `/coordinates/process`;
    const dadosCoords = {
        'lat_str': lat_str,
        'lon_str': lon_str,
        'lat_end': lat_end,
        'lon_end': lon_end,
        'mbr_lat_str': mbr_lat_str,
        'mbr_lon_str': mbr_lon_str,
        'mbr_lat_end': mbr_lat_end,
        'mbr_lon_end': mbr_lon_end,
    };

    const postRequest = {
        method: 'POST',
        body: JSON.stringify(dadosCoords),
        headers: { 'Content-type': 'application/json' }
    };

    fetch(URL, postRequest)
        .then(resposta => { if (!resposta.ok) throw Error(resposta.status); return resposta; })
        .then(resposta => resposta.json());
    
    var lat_center = (parseInt(mbr_lat_end) + parseInt(mbr_lat_str)) * 0.5;
    var lon_center = (parseInt(mbr_lon_end) + parseInt(mbr_lon_str)) * 0.5;

    console.log(lat_center);

    mapboxgl.accessToken = 'pk.eyJ1Ijoic29sZW1uIiwiYSI6ImNsZmlvbDBibjBrNTg0M25taG1xM2x2YXIifQ.aiMQpTd20YpCaWJfL5BmIg';
    var map = new mapboxgl.Map({
        container: 'map',
        style: 'mapbox://styles/mapbox/streets-v11',
        center: [lon_center, lat_center],
        zoom: 6
    });
}

var nodes;
var links;

const padding = 50;

fetch('http://localhost:8080/coordinates/Data', {
    method: 'GET'
})
    .then(response => response.json())
    .then(data => {
        latLonArray = data.map(item => [item.lon, item.lat]);
 });






mapboxgl.accessToken = 'pk.eyJ1Ijoic29sZW1uIiwiYSI6ImNsZmlvbDBibjBrNTg0M25taG1xM2x2YXIifQ.aiMQpTd20YpCaWJfL5BmIg';

var map = new mapboxgl.Map({
    container: 'map',
    style: 'mapbox://styles/mapbox/streets-v11',
    center: [-45, -22],
    zoom: 8
});


 map.on('load', function () {

     var coordinates = latLonArray
     coordinates.forEach(function (coordinate) {
         new mapboxgl.Marker()
             .setLngLat(coordinate)
             .addTo(map);
     });
     
     var geojson = {
         type: 'FeatureCollection',
         features: [{
             type: 'Feature',
             geometry: {
                 type: 'LineString',
                 coordinates: coordinates
             }
         }]
     };

     map.addSource('route', {
         type: 'geojson',
         data: geojson
     });

     map.addLayer({
         id: 'route',
         type: 'line',
         source: 'route',
         layout: {
             'line-join': 'round',
             'line-cap': 'round'
         },
         paint: {
             'line-color': '#888',
             'line-width': 8
         }
     });
 });