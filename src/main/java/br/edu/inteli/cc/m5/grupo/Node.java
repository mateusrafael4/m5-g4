package br.edu.inteli.cc.m5.grupo;
import java.util.List;

public class Node {
    private String key; // teste
    private double lat; // y
    private double lon; // x
    private double height;
    private double hScore = 0; //
    private double gScore = 0; // Distância desse nó até o nó final
    private double fScore;
    private Node parent;
    private List<Node> neighbors;
        
    public Node(String key, double lon, double lat){
        this.key = key;
        this.lat = lat;
        this.lon = lon;
    }

    public String getName(){
        return key;
    }
    
    public void addNeighbor(Node node){ // teste 
        neighbors.add(node);
    }

    public double get_lat(){
        return lat;
    }

    public double get_lon(){
        return lon;
    }

    public double get_fScore(){
        return fScore;
    }

    public double get_gScore(){
        return gScore;
    }

    public Node get_parent(){
        return parent;
    }

    public List<Node> get_neighbors(){
        return neighbors;
    }
    
    public double get_distance(Node that){
        // Raio da Terra
        double r = 6371.0;
        
        //  Latitude e longitude inicial
        double x1 = Math.toRadians(this.lat);
        double y1 = Math.toRadians(this.lon);
        
        // Latitude e longitude do destino
        double x2 = Math.toRadians(that.lat);
        double y2 = Math.toRadians(that.lon);
        
        // Fórmula de haversine para calcular a distancia total
        
        // ponto horizontal
        return (2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((x2 - x1) / 2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2))));
    }

    public void set_hScore(double score){
        hScore = score;
        fScore = gScore + hScore;
    }

    public void set_gScore(double score){
        gScore = score;
        fScore = gScore + hScore;
    }

    public void set_parent(Node node){
        parent = node;
    }
}
