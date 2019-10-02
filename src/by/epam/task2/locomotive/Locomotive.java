package by.epam.task2.locomotive;

import by.epam.task2.RailwayTransport;

public class Locomotive extends RailwayTransport {
    private EngineType engineType;
    private int speed;

    public Locomotive() {
    }

    public Locomotive(EngineType engineType, int speed) {
        this.engineType = engineType;
        this.speed = speed;
    }

    public Locomotive(int wheels, int weight, int length, int width, String color, EngineType engineType, int speed) {
        super(wheels, weight, length, width, color);
        this.engineType = engineType;
        this.speed = speed;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Locomotive{" + "engineType=" + engineType + ", speed=" + speed + '}';
    }
}
