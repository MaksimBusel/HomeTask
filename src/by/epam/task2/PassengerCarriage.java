package by.epam.task2;

import by.epam.task2.entity.CarriageType;

import java.util.Objects;

public class PassengerCarriage extends RailwayTransport {

    private CarriageType carriageType;
    private int numberOfSeats;
    private int baggageWeight;

    public PassengerCarriage() {
    }

    public PassengerCarriage(CarriageType carriageType, int numberOfSeats, int baggageWeight) {
        this.carriageType = carriageType;
        this.baggageWeight = baggageWeight;
        this.numberOfSeats = numberOfSeats;
    }

    public PassengerCarriage(int wheels, int weight, int length, int width, String color, CarriageType carriageType,
                             int numberOfSeats, int baggageWeight) {
        super(wheels, weight, length, width, color);
        this.carriageType = carriageType;
        this.baggageWeight = baggageWeight;
        this.numberOfSeats = numberOfSeats;
    }

    public CarriageType getCarriageType() {
        return carriageType;
    }

    public void setCarriageType(CarriageType carriageType) {
        this.carriageType = carriageType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getBaggageWeight() {
        return baggageWeight;
    }

    public void setBaggageWeight(int baggageWeight) {
        this.baggageWeight = baggageWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        PassengerCarriage that = (PassengerCarriage) o;
        return ((numberOfSeats == that.numberOfSeats) && (baggageWeight == that.baggageWeight));
    }

    @Override
    public int hashCode() {
        int result = numberOfSeats;
        result = 31 * result;
        result = 31 * result + baggageWeight;
        return result;
    }

    @Override
    public String toString() {
        return "PassengerCarriage{" + "carriageType=" + carriageType + ", numberOfSeats=" + numberOfSeats +
                ", baggageWeight=" + baggageWeight + '}';
    }
}
