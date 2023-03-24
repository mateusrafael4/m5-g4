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
    //.then(jsonResponse => inicializar(jsonResponse))
    // .catch(function(error) { paragrafoMensagem.innerHTML = 'Erro ao criar novo professor (código ' + error.message + ')'; } );
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

