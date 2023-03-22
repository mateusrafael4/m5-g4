mapboxgl.accessToken = 'pk.eyJ1Ijoic29sZW1uIiwiYSI6ImNsZmlvbDBibjBrNTg0M25taG1xM2x2YXIifQ.aiMQpTd20YpCaWJfL5BmIg';
    var map = new mapboxgl.Map({
        container: 'map',
        style: 'mapbox://styles/mapbox/streets-v11',
        center: [-74.50, 40], // initial map center
        zoom: 9 // initial map zoom level
    });
    map.on('load', function () {
        // add markers for each coordinate
        var coordinates = [
            [-74.00597, 40.71427], // New York
            [-118.24368, 34.05223], // Los Angeles
            [-77.03637, 38.89511] // Washington DC
        ];
        coordinates.forEach(function (coordinate) {
            new mapboxgl.Marker()
                .setLngLat(coordinate)
                .addTo(map);
        });
        // create a GeoJSON object with the coordinates
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
        // add the GeoJSON object as a source for a line layer
        map.addSource('route', {
            type: 'geojson',
            data: geojson
        });
        // add a line layer with the route
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