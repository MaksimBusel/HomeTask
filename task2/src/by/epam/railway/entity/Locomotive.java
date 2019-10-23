package by.epam.railway.entity;

import by.epam.railway.exception.IncorrectValueException;

public class Locomotive extends RailwayTransport {
    private EngineType engineType;
    private int speed;

    public Locomotive() {
    }

    public Locomotive(EngineType engineType, int speed) {
        this.engineType = engineType;
        setSpeed(speed);
    }

    public Locomotive(int wheels, int weight, int length, int width, String color) {
        super(wheels, weight, length, width, color);
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
        if (speed < 0) {
            throw new IncorrectValueException();
        }
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Locomotive that = (Locomotive) o;
        return speed == that.speed;
    }

    @Override
    public int hashCode() {
        int result = speed;
        result = 31 * result + speed;
        return result * 31;
    }

    @Override
    public String toString() {
        return "Locomotive{" + "engineType=" + engineType + ", speed=" + speed + '}';
    }
}
