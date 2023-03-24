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
import br.edu.inteli.cc.m5.grupo.entities.NodeEntity;
import br.edu.inteli.cc.m5.grupo.repositories.NodeRepository;
import br.edu.inteli.cc.m5.grupo.AStar;
import br.edu.inteli.cc.m5.grupo.Grid;
import br.edu.inteli.cc.m5.grupo.Nodes;
import br.edu.inteli.cc.m5.dted.DtedDatabaseHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
// import org.springframework.web.server.ResponseStatusException;
// import org.springframework.http.HttpStatus;


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/coordinates")
public class CoordinatesController { 
    
    @Autowired
    private NodeRepository nodeRepository;


    /**
     * This method handles a GET request for retrieving all coordinates.
     * @return a List of all coordinates stored in the database.
     */
    @GetMapping("/Data")
    public List<NodeEntity> listAllCoordinates() {
        return nodeRepository.findAll();
    }

    // public Map<String, Object> listAllNode() {

        // List<Map<String, Object>> results = nodeRepository.findAllProjectedBy();
        // Map<String, Object> result = new HashMap<>();
        // for (Map<String, Object> map : results) {
        //     result.put((String) map.get("lat"), map.get("lon"));
        // }
        // return result;

            
    //         Map<String, Object> response = new HashMap<>();
    
    //         Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "12341234"));
    //         Session session = driver.session();
    
    //         String query = "MATCH (n) OPTIONAL MATCH (n)-[r]->() RETURN n.lon, n.lat, r";
    //         Result result = session.run(query);
    
    //         List<Map<String, Object>> nodes = new ArrayList<>();
    //         List<Map<String, Object>> links = new ArrayList<>();
    
    //         while (result.hasNext()) {
    //             Record record = result.next();
    
    //             Node node = record.get("n").asNode();
    //             Map<String, Object> nodeMap = new HashMap<>();
    //             nodeMap.put("id", node.id());
    //             nodeMap.put("label", node.get("name").asString());
    //             nodes.add(nodeMap);
    
    //             Value relationshipValue = record.get("r");
    //             if (!relationshipValue.isNull()) {
    //                 Relationship relationship = relationshipValue.asRelationship();
    //                 Map<String, Object> linkMap = new HashMap<>();
    //                 linkMap.put("source", relationship.startNodeId());
    //                 linkMap.put("target", relationship.endNodeId());
    //                 linkMap.put("type", relationship.type());
    //                 links.add(linkMap);
    //             }
    //         }
    
    //         response.put("nodes", nodes);
    //         response.put("links", links);
    
    //         session.close();
    //         driver.close();
    
    //         return response;
        

    // }
    
    

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

        
        Grid grid = new Grid(newCoord.getMbr_lat_str(), newCoord.getMbr_lon_str(), newCoord.getMbr_lat_end(), newCoord.getMbr_lon_end());
        AStar aStar = new AStar();
        List<Nodes> path = aStar.findPath(grid, newCoord.getLat_str(), newCoord.getLon_str(), newCoord.getLat_end(), newCoord.getLon_end());

        NodeEntity nodeEntityParent = null;
        for (Nodes node : path){
            double lat = node.getLat();
            double lon = node.getLon();
            int elevation = node.getElevation();
            Nodes parent = node.getParent();

            NodeEntity nodeEntity = new NodeEntity(lat, lon, elevation);
            if (parent == null) {
                nodeEntityParent = nodeEntity;
            }
            else {
                nodeEntity.addParent(nodeEntityParent);
                nodeEntityParent = nodeEntity;
            }
            nodeRepository.save(nodeEntity);
            

            System.out.println(node);
        }
        // chame um método que execute o algoritmo usando as informações extraídas do formulário HTML

        return newCoord;
    }     


}