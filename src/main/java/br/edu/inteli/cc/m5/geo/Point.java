package br.edu.inteli.cc.m5.geo;

public class Point {
    private double longitude;
    private double latitude;
    private int elevation;
    public Point(double longitude, double latitude, int elevation) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.elevation = elevation;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public int getElevation() {
        return elevation;
    }
    public void setElevation(int elevation) {
        this.elevation = elevation;
    }
    @Override
    public String toString() {
        return "Point [longitude=" + longitude + ", latitude=" + latitude + ", elevation=" + elevation + "]";
    }
}
