package br.edu.inteli.cc.m5.grupo.controllers;

import br.edu.inteli.cc.m5.grupo.entities.Coordinates;
import br.edu.inteli.cc.m5.grupo.repositories.CoordinatesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.List;



@RestController
@RequestMapping("/coordinates")
public class CoordinatesController { 
    
    @Autowired
    private CoordinatesRepository coordinatesRepository;


    /**
     * This method handles a GET request for retrieving all coordinates.
     * @return a List of all coordinates stored in the database.
     */
    @GetMapping("/")
    public List<Coordinates> listAllCoordinates() {
        return coordinatesRepository.findAll();
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
        System.out.println("alt_end: " + newCoord.getLat_end());
        System.out.println("lon_end: " + newCoord.getLon_end());

        
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

