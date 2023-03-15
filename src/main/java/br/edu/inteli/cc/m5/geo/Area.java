package br.edu.inteli.cc.m5.geo;

public class Area {
    private double minLongitude;
    private double maxLongitude;
    private double minLatitude;
    private double maxLatitude;
    
    public Area(double minLongitude, double maxLongitude, double minLatitude, double maxLatitude) {
        this.minLongitude = minLongitude;
        this.maxLongitude = maxLongitude;
        this.minLatitude = minLatitude;
        this.maxLatitude = maxLatitude;
    }
    
    public double getMinLongitude() {
        return minLongitude;
    }
    public void setMinLongitude(double minLongitude) {
        this.minLongitude = minLongitude;
    }
    public double getMaxLongitude() {
        return maxLongitude;
    }
    public void setMaxLongitude(double maxLongitude) {
        this.maxLongitude = maxLongitude;
    }
    public double getMinLatitude() {
        return minLatitude;
    }
    public void setMinLatitude(double minLatitude) {
        this.minLatitude = minLatitude;
    }
    public double getMaxLatitude() {
        return maxLatitude;
    }
    public void setMaxLatitude(double maxLatitude) {
        this.maxLatitude = maxLatitude;
    }

    @Override
    public String toString() {
        return "Area [minLongitude=" + minLongitude + ", maxLongitude=" + maxLongitude + ", minLatitude=" + minLatitude
                + ", maxLatitude=" + maxLatitude + "]";
    }
    
}

