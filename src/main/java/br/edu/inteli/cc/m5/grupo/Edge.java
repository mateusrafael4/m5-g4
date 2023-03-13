package br.edu.inteli.cc.m5.grupo;

public class Edge {
    private int toNode;
    private double weight;

     public Edge(int toNode, double weight) {
        this.toNode = toNode;
        this.weight = weight;
    }

    public int getToNode(){
        return toNode;
    }
    
    public double getWeight() {
        return weight;
    }
    
}