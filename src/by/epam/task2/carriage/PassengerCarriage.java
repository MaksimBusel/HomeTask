package by.epam.task2.carriage;

import by.epam.task2.RailwayTransport;

public class PassengerCarriage extends RailwayTransport {

    private CarriageType carriageType;
    private int baggageWeight;

    public PassengerCarriage() {
    }

    public PassengerCarriage(CarriageType carriageType, int baggageWeight) {
        this.carriageType = carriageType;
        this.baggageWeight = baggageWeight;
    }

    public PassengerCarriage(int wheels, int weight, int length, int width, String color, CarriageType carriageType, int baggageWeight) {
        super(wheels, weight, length, width, color);
        this.carriageType = carriageType;
        this.baggageWeight = baggageWeight;
    }

    public CarriageType getCarriageType() {
        return carriageType;
    }

    public int getBaggageWeight() {
        return baggageWeight;
    }

    public void setCarriageType(CarriageType carriageType) {
        this.carriageType = carriageType;
    }

    public void setBaggageWeight(int baggageWeight) {
        this.baggageWeight = baggageWeight;
    }

    @Override
    public String toString() {
        return "PassengerCarriage{" + "carriageType=" + carriageType + ", baggageWeight=" + baggageWeight + '}';
    }
}
