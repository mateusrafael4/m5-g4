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

        // cria o grafo com a biblioteca d3 através das informações das arrays nodes e links
        var svg = d3.select('#graph')
            .append('svg')
            .attr('class', 'svg')
            .attr('id', 'svg')
        width = +svg.attr("width"),
            height = +svg.attr("height");


        const simulation = d3.forceSimulation(nodes)
            .force("link", d3.forceLink(links).id(function (d) { return d.id; }).distance(80))
            .force('charge', d3.forceManyBody().strength(-200))
            .force("center", d3.forceCenter(width / 2, height / 2));

        const link = svg.append('g')
            .attr('stroke', '#999')
            .attr('stroke-opacity', 7)
            .selectAll('line')
            .data(links)
            .join('line')
            .attr('stroke-width', 7);

        const node = svg.append('g')
            .attr("class", "nodes")
            .attr('stroke', '#fff')
            .attr('stroke-width', 1.5)
            .selectAll('circle')
            .data(nodes)
            .join('circle')
            .attr('r', 20)
            .attr('fill', '#555')
            .attr('cx', d => d.x + padding) // adiciona o padding à coordenada x
            .attr('cy', d => d.y + padding) // adiciona o padding à coordenada y
            .call(drag(simulation));



        node.append('title')
            .text(d => d.label);

        simulation.on('tick', () => {
            link
                .attr('x1', d => d.source.x + padding)
                .attr('y1', d => d.source.y + padding)
                .attr('x2', d => d.target.x + padding)
                .attr('y2', d => d.target.y + padding);

            node
                .attr('cx', d => d.x + padding)
                .attr('cy', d => d.y + padding);
        });

        function drag(simulation) {
            function dragstarted(event, d) {
                if (!event.active) simulation.alphaTarget(0.3).restart();
                d.fx = d.x;
                d.fy = d.y;
            }

            function dragged(event, d) {
                d.fx = event.x;
                d.fy = event.y;
            }

            function dragended(event, d) {
                if (!event.active) simulation.alphaTarget(0);
                d.fx = null;
                d.fy = null;
            }
            return d3.drag()
                .on('start', dragstarted)
                .on('drag', dragged)
                .on('end', dragended);
        }
    });

