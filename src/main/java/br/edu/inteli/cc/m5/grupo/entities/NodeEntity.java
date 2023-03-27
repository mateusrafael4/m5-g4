package br.edu.inteli.cc.m5.grupo.entities;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;


@Node
public class NodeEntity {

    @Id @GeneratedValue
    private Long id;
    private double lat; 
    private double lon; 
    private int elevation;

    @Relationship(type = "COMES_FROM", direction = Direction.OUTGOING)
	private List<NodeEntity> parents = new ArrayList<>();

     /**
     * Constructor for a NodeEntity object.
     * 
     * @param lat 
     * @param lon 
     * @param elevation 
     */

     public NodeEntity(Double lat, Double lon, int elevation) {
        this.lat = lat;
        this.lon = lon;
        this.elevation = elevation;
     }

     public void addParent(NodeEntity parent) {
        parents.add(parent);
    }

    public NodeEntity() {}

    /**
     * Returns the ID of this node.
     * 
     * @return the ID of this node
     */
    public Long getId() {
        return id;
    }   


    /**
     * Sets the latitude coordinate of this node.
     * 
     * @param lat the latitude coordinate to set
     */
    public void getLat(Double lat) {
        this.lat = lat;
    }

    /**
     * Returns the latitude coordinate of this node.
     * 
     * @return the latitude coordinate of this node
     */
    public Double getLat() {
        return lat;
    }


    /**
     * Sets the latitude coordinate of this node.
     * 
     * @param lon the latitude coordinate to set
     */
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * Returns the londitude coordinate of this node.
     * 
     * @return the longitude coordinate of this node
     */
    public Double getLon() {
        return lon;
    }

    /**
     * Sets the elevation of this node.
     * 
     * @param elevation 
     */
    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    /**
     * Returns the latitude coordinate of this node.
     * 
     * @return the latitude coordinate of this node
     */
    public int getElevation() {
        return elevation;
    }


    /**
     * Returns a string representation of this node.
     * 
     * @return a string representation of this node
     */
    public String toString() {
        return String.format("(%1$-3s, %2$-3s, %3$-3s)", lat, lon, elevation);
    }
}
