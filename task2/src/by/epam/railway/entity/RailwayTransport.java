package by.epam.railway.entity;

public abstract class RailwayTransport {
    private int wheels;
    private int weight;
    private int length;
    private int width;
    private String color;

    public RailwayTransport() {}

    public RailwayTransport(int wheels, int weight, int length, int width, String color) {
        this.wheels = wheels;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return 0;
    }

    public int getBaggageWeight() {return 0;}
}
