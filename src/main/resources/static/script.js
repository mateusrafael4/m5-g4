mapboxgl.accessToken = 'pk.eyJ1Ijoic29sZW1uIiwiYSI6ImNsZmlvbDBibjBrNTg0M25taG1xM2x2YXIifQ.aiMQpTd20YpCaWJfL5BmIg';
var map = new mapboxgl.Map({
    container: 'map',
    style: 'mapbox://styles/mapbox/streets-v11',
    center: [-48.63, -22.50], // lon , lat
    zoom: 6 // initial map zoom level
});

function enviarDados() { // botão que enviará os inputs do front para o back
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

    mapboxgl.accessToken = 'pk.eyJ1Ijoic29sZW1uIiwiYSI6ImNsZmlvbDBibjBrNTg0M25taG1xM2x2YXIifQ.aiMQpTd20YpCaWJfL5BmIg';
    var map = new mapboxgl.Map({
        container: 'map',
        style: 'mapbox://styles/mapbox/streets-v11',
        center: [lon_center, lat_center], // lon, lat
        zoom: 6 // initial map zoom level
    });
}

var nodes;
var links;

const padding = 50;

fetch('http://localhost:8080/coordinates/Data', { // acessa a rota get/data criada no back para passar as duas arrays
    method: 'GET'
})
    .then(response => response.json())
    .then(data => {
        console.log(data);
        nodes = data.nodes;
        links = data.links;

    });


// mapa


mapboxgl.accessToken = 'pk.eyJ1Ijoic29sZW1uIiwiYSI6ImNsZmlvbDBibjBrNTg0M25taG1xM2x2YXIifQ.aiMQpTd20YpCaWJfL5BmIg';

var map = new mapboxgl.Map({
    container: 'map',
    style: 'mapbox://styles/mapbox/streets-v11',
    center: [-48.63, -22.50], // initial map center
    zoom: 6 // initial map zoom level
});


// map.on('load', function () {
//     // add markers for each coordinate
//     var coordinates = [
//         [-74.00597, 40.71427], // New York
//         [-118.24368, 34.05223], // Los Angeles
//         [-77.03637, 38.89511] // Washington DC
//     ];
//     coordinates.forEach(function (coordinate) {
//         new mapboxgl.Marker()
//             .setLngLat(coordinate)
//             .addTo(map);
//     });
//     // create a GeoJSON object with the coordinates
//     var geojson = {
//         type: 'FeatureCollection',
//         features: [{
//             type: 'Feature',
//             geometry: {
//                 type: 'LineString',
//                 coordinates: coordinates
//             }
//         }]
//     };
//     // add the GeoJSON object as a source for a line layer
//     map.addSource('route', {
//         type: 'geojson',
//         data: geojson
//     });
//     // adiciona a aresta
//     map.addLayer({
//         id: 'route',
//         type: 'line',
//         source: 'route',
//         layout: {
//             'line-join': 'round',
//             'line-cap': 'round'
//         },
//         paint: {
//             'line-color': '#888',
//             'line-width': 8
//         }
//     });
// });