package br.edu.inteli.cc.m5.grupo.controllers;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Value;
import org.neo4j.driver.types.Node;
import org.neo4j.driver.types.Relationship;

import br.edu.inteli.cc.m5.grupo.entities.Coordinates;
import br.edu.inteli.cc.m5.grupo.repositories.CoordinatesRepository;
import br.edu.inteli.cc.m5.grupo.AStar;
import br.edu.inteli.cc.m5.grupo.Grid;
import br.edu.inteli.cc.m5.grupo.Nodes;
import br.edu.inteli.cc.m5.dted.DtedDatabaseHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/coordinates")
public class CoordinatesController { 
    
    @Autowired
    private CoordinatesRepository coordinatesRepository;


    /**
     * This method handles a GET request for retrieving all coordinates.
     * @return a List of all coordinates stored in the database.
     */
    @GetMapping("/Data")
    public Map<String, Object> listAllCoordinates() {
        // return coordinatesRepository.findAll();
            
            Map<String, Object> response = new HashMap<>();
    
            Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "12341234"));
            Session session = driver.session();
    
            String query = "MATCH (n) OPTIONAL MATCH (n)-[r]->() RETURN n, r";
            Result result = session.run(query);
    
            List<Map<String, Object>> nodes = new ArrayList<>();
            List<Map<String, Object>> links = new ArrayList<>();
    
            while (result.hasNext()) {
                Record record = result.next();
    
                Node node = record.get("n").asNode();
                Map<String, Object> nodeMap = new HashMap<>();
                nodeMap.put("id", node.id());
                nodeMap.put("label", node.get("name").asString());
                nodes.add(nodeMap);
    
                Value relationshipValue = record.get("r");
                if (!relationshipValue.isNull()) {
                    Relationship relationship = relationshipValue.asRelationship();
                    Map<String, Object> linkMap = new HashMap<>();
                    linkMap.put("source", relationship.startNodeId());
                    linkMap.put("target", relationship.endNodeId());
                    linkMap.put("type", relationship.type());
                    links.add(linkMap);
                }
            }
    
            response.put("nodes", nodes);
            response.put("links", links);
    
            session.close();
            driver.close();
    
            return response;
        

    }
    
    /**
     * This method handles a GET request for retrieving a coordinate by its ID.
     * @param id the ID of the coordinate to retrieve.
     * @return the Coordinate object corresponding to the specified ID, or null if it does not exist.
     */
    @GetMapping("/{id}")
    public Coordinates listCoordinateById(@PathVariable Long id) {
        return coordinatesRepository.findById(id).orElse(null);
    }
    

    /**
     * This method handles a POST request for creating a new coordinate.
     * @param Coordinates the Coordinate object to store.
     * @return the newly stored Coordinate object.
     */
     
    @PostMapping("/process")

        // public Coordinates storeCoordinates(@RequestBody Coordinates coordinates) {
        //     return coordinatesRepository.save(coordinates);
        // }

    public Coordinates enviarDados(@RequestBody Coordinates newCoord) {
        System.out.println("lat_str: " + newCoord.getLat_str());
        System.out.println("lon_str: " + newCoord.getLon_str());
        System.out.println("lat_end: " + newCoord.getLat_end());
        System.out.println("lon_end: " + newCoord.getLon_end());
        System.out.println("mbr_lat_str: " + newCoord.getMbr_lat_str());
        System.out.println("mbr_lon_str: " + newCoord.getMbr_lon_str());
        System.out.println("mbr_lat_end: " + newCoord.getMbr_lat_end());
        System.out.println("mbr_lon_end: " + newCoord.getMbr_lon_end());

        
        // Grid grid = new Grid(newCoord.getLat_str(), newCoord.getLon_str(), newCoord.getLat_end(), newCoord.getLon_end());
        // AStar aStar = new AStar();
        // List<Nodes> path = aStar.findPath(grid, grid.getGrid().get(0), grid.getGrid().get(grid.getGrid().size() - 1));
        // // grid.getGrid().get(0) = Nó inicial.
        // // grid.getGrid().get(grid.getGrid().size() - 1) = Nó final.
        // for (Nodes node : path){
        //     System.out.println(node);
        // }
        // chame um método que execute o algoritmo usando as informações extraídas do formulário HTML

        return newCoord;
    }



    

    /**
     * This method handles a PUT request for updating an existing coordinate.
     * @param id the ID of the coordinate to update.
     * @param coordinates the updated Coordinate object.
     * @return the updated Coordinate object, or null if the specified ID does not exist.
     */
    @PutMapping("/{id}")
    public Coordinates updateCoordinates(@PathVariable Long id, @RequestBody Coordinates coordinates) {
        Coordinates existingCoordinates = coordinatesRepository.findById(id).orElse(null);
        if (existingCoordinates != null) {
            existingCoordinates.setLat_str(coordinates.getLat_str());
            existingCoordinates.setLon_str(coordinates.getLon_str());
            existingCoordinates.setLat_end(coordinates.getLat_end());
            existingCoordinates.setLon_end(coordinates.getLon_end());
            return coordinatesRepository.save(existingCoordinates);
        }
        return null;    
    }
    
    /**
     * This method handles a DELETE request for deleting a coordinate.
     * @param id the ID of the coordinate to delete.
     */
    @DeleteMapping("/delete/{id}")
    public void deleteCoordinates(@PathVariable Long id) {
        Coordinates coordinates = coordinatesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Coordenada com o id: " + id + " não encontrada "));
        coordinatesRepository.delete(coordinates);
    }    

}