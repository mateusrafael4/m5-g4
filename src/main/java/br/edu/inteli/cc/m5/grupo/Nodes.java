package br.edu.inteli.cc.m5.grupo;
import java.util.HashMap;
import java.util.Optional;

import br.edu.inteli.cc.m5.dted.DtedDatabaseHandler;

public class Nodes {
    private int id; // teste
    private double lat; // y
    private double lon; // x
    private int elevation;
    private double hScore = 0; // Distância desse nó até o fim.
    private double gScore = 0; // Custo do caminho mais curto encontrado até a visita desse nó.
    private double fScore; // gScore + fScore
    private Nodes parent; // Nó antecessor (utilizado para voltar o caminho mais curto)
    private HashMap<Integer, Double> edges; // Conteém todos os vizinhos do nó e o peso das arestas
        
    // Construtor
    /**
     * @param id
     * @param lon
     * @param lat
     */
    public Nodes(int id, double lon, double lat){
        this.id = id;
        this.lat = lat;
        this.lon = lon;
        
        // O banco de dados Dted é chamado para a descoberta das alturas por meio das latitudes e longitudes
        DtedDatabaseHandler dbHandler = new DtedDatabaseHandler();
        boolean dbHandlerInitializedRio = dbHandler.InitializeFromResources("dted/Rio");
        boolean dbHandlerInitializedSP = dbHandler.InitializeFromResources("dted/SaoPaulo");

        // Caso as coordenadas não pertençam ao banco de dados, o código retorna erro
        if (!dbHandlerInitializedRio || !dbHandlerInitializedSP) {
            throw new IllegalArgumentException("Failed to initialize DtedDatabaseHandler");
        }

        Optional<Integer> height = dbHandler.QueryLatLonElevation(lon, lat);
        if (height.isPresent()) {
            this.elevation = height.get();
        }

        this.edges = new HashMap<>();
    }

    // Construtores utilizados no Intermediary_Points

    public Nodes(double lon, double lat){
        this(lon, lat, 0);
        this.edges = new HashMap<>();
    }

    public Nodes(double lon, double lat, int elevation){
        this.lat = lat;
        this.lon = lon;
        this.elevation = elevation;
        this.edges = new HashMap<>();
    }

    public int getID(){
        return id;
    }
    
    public void addNeighbor(Edge edge){
        edges.put(edge.getToNode(), edge.getWeight());
    }

    public double getLat(){
        return lat;
    }

    public double getLon(){
        return lon;
    }

    public int getElevation(){
        return elevation;
    }

    public double getFScore(){
        return fScore;
    }

    public double getGScore(){
        return gScore;
    }

    public Nodes getParent(){
        return parent;
    }

    public HashMap<Integer, Double> getEdges(){
        return new HashMap<>(edges);
    }
    
    // Não necessário, mas está aqui para evitar qualquer erro no futuro.
    public String toString() {
        return "Node: (" + id + ", " + lat + ", " + lon + ", " + elevation + ")";
    }

    public double getDistance(Nodes that){
        // Raio da Terra
        double r = 6371.0;
        
        //  Latitude e longitude inicial
        double x1 = Math.toRadians(this.lat);
        double y1 = Math.toRadians(this.lon);
        
        // Latitude e longitude do destino
        double x2 = Math.toRadians(that.lat);
        double y2 = Math.toRadians(that.lon);
        
        // Fórmula de haversine para calcular a distancia total
        
        // Distância entre os dois pontos
        return (2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((x2 - x1) / 2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2))));
    }

    public void setHScore(double score){
        hScore = score;
        fScore = gScore + hScore;
    }

    public void setGScore(double score){
        gScore = score;
        fScore = gScore + hScore;
    }

    public void setParent(Nodes node){
        parent = node;
    }
}
