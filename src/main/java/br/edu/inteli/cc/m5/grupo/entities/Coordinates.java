package br.edu.inteli.cc.m5.grupo.entities;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;


@Node
public class Coordinates {
    
    // Node attributes
    /**
     *
     */
    @Id @GeneratedValue
    private Long id;
    private Double lat_str;
    private Double lon_str;
    private Double lat_end;
    private Double lon_end;
    private Double mbr_lat_str;
    private Double mbr_lon_str;
    private Double mbr_lat_end;
    private Double mbr_lon_end;


    /**
     * Constructor for a Coordinate object.
     * 
     * @param lat_str the start latitude coordinate
     * @param lon_str the start longitude coordinate
     * @param lat_end the end latitude coordinate
     * @param lon_end the end longitude coordinate
     * @param mbr_lat_str the start MBR latitude coordinate
     * @param mbr_lon_str the start MBR longitude coordinate
     * @param mbr_lat_end the end MBR altitude coordinate
     * @param mbr_lon_end the end MBR altitude coordinate

     */
    public Coordinates(Double lat_str, Double lon_str, Double lat_end, Double lon_end, 
    Double mbr_lat_str, Double mbr_lon_str, Double mbr_lat_end, Double mbr_lon_end) {
        this.lat_str = lat_str;
        this.lon_str = lon_str;
        this.lat_end = lat_end;
        this.lon_end = lon_end;
        this.mbr_lat_str = mbr_lat_str;
        this.mbr_lon_str = mbr_lon_str;
        this.mbr_lat_end = mbr_lat_end;
        this.mbr_lon_end = mbr_lon_end;
    }

    public Coordinates() {}

    // Getters and setters

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
     * @param lat_str the latitude coordinate to set
     */
    public void setLat_str(Double lat_str) {
        this.lat_str = lat_str;
    }

    /**
     * Returns the latitude coordinate of this node.
     * 
     * @return the latitude coordinate of this node
     */
    public Double getLat_str() {
        return lat_str;
    }

    /**
     * Sets the longitude coordinate of this node.
     * 
     * @param lon_str the longitude coordinate to set
     */
    public void setLon_str(Double lon_str) {
        this.lon_str = lon_str;
    }

    /**
     * Returns the longitude coordinate of this node.
     * 
     * @return the longitude coordinate of this node
     */
    public Double getLon_str() {
        return lon_str;
    }

    /**
     * Sets the altitude coordinate of this node.
     * 
     * @param lat_end the altitude coordinate to set
     */
    public void setLat_end(Double lat_end) {
        this.lat_end = lat_end;
    }

    /**
     * Returns the altitude coordinate of this node.
     * 
     * @return the altitude coordinate of this node
     */
    public Double getLat_end() {
        return lat_end;
    }

    /**
     * Sets the altitude coordinate of this node.
     * 
     * @param lon_end the altitude coordinate to set
     */
    public void setLon_end(Double lon_end) {
        this.lon_end = lon_end;
    }

    /**
     * Returns the altitude coordinate of this node.
     * 
     * @return the altitude coordinate of this node
     */
    public Double getLon_end() {
        return lon_end;
    }

 /**
     * Sets the latitude coordinate of this node.
     * 
     * @param mbr_lat_str the latitude coordinate to set
     */
    public void setMbr_lat_str(Double mbr_lat_str) {
        this.mbr_lat_str = mbr_lat_str;
    }

    /**
     * Returns the latitude coordinate of this node.
     * 
     * @return the latitude coordinate of this node
     */
    public Double getMbr_lat_str() {
        return mbr_lat_str;
    }

    /**
     * Sets the longitude coordinate of this node.
     * 
     * @param mbr_lon_str the longitude coordinate to set
     */
    public void setMbr_lon_str(Double mbr_lon_str) {
        this.mbr_lon_str = mbr_lon_str;
    }

    /**
     * Returns the longitude coordinate of this node.
     * 
     * @return the longitude coordinate of this node
     */
    public Double getMbr_lon_str() {
        return mbr_lon_str;
    }

    /**
     * Sets the altitude coordinate of this node.
     * 
     * @param mbr_lat_end the altitude coordinate to set
     */
    public void setMbr_lat_end(Double mbr_lat_end) {
        this.mbr_lat_end = mbr_lat_end;
    }

    /**
     * Returns the altitude coordinate of this node.
     * 
     * @return the altitude coordinate of this node
     */
    public Double getMbr_lat_end() {
        return mbr_lat_end;
    }

    /**
     * Sets the altitude coordinate of this node.
     * 
     * @param mbr_lon_end the altitude coordinate to set
     */
    public void setMbr_lon_end(Double mbr_lon_end) {
        this.mbr_lon_end = mbr_lon_end;
    }

    /**
     * Returns the altitude coordinate of this node.
     * 
     * @return the mbr end longitude coordinate of this node
     */
    public Double getMbr_lon_end() {
        return mbr_lon_end;
    }





    /**
     * Returns a string representation of this node.
     * 
     * @return a string representation of this node
     */
    public String toString() {
        String lat_strStr = lat_str.toString();
        String lon_strStr = lon_str.toString();
        String lat_endStr = lat_end.toString();
        String lon_endStr = lon_end.toString();
        String mbr_lat_strStr = mbr_lat_str.toString();
        String mbr_lon_strStr = mbr_lon_str.toString();
        String mbr_lat_endStr = mbr_lat_end.toString();
        String mbr_lon_endStr = mbr_lon_end.toString();
        return String.format("(%1$-3s, %2$-3s, %3$-3s)", lat_strStr, lon_strStr, lat_endStr, lon_endStr,  
        mbr_lat_strStr,  mbr_lon_strStr,  mbr_lat_endStr,  mbr_lon_endStr);
    }

}