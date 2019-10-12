package by.epam.task2.entity;

import by.epam.task2.exception.IncorrectValueException;

public class PassengerCarriage extends RailwayTransport {

    private CarriageType carriageType;
    private int numberOfSeats;
    private int baggageWeight;

    public PassengerCarriage() {
    }

    public PassengerCarriage(CarriageType carriageType, int numberOfSeats, int baggageWeight) {
        this.carriageType = carriageType;
        setBaggageWeight(baggageWeight);
        setNumberOfSeats(numberOfSeats);
    }

    public PassengerCarriage(int wheels, int weight, int length, int width, String color) {
        super(wheels, weight, length, width, color);
    }

    public CarriageType getCarriageType() {
        return carriageType;
    }

    public void setCarriageType(CarriageType carriageType) {
        this.carriageType = carriageType;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats < 0) {
            throw new IncorrectValueException();
        }
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int getBaggageWeight() {
        return baggageWeight;
    }

    public void setBaggageWeight(int baggageWeight) {
        if (baggageWeight < 0) {
            throw new IncorrectValueException();
        }
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
        result = 31 * result + numberOfSeats;
        result = 31 * result + baggageWeight;
        return result;
    }

    @Override
    public String toString() {
        return "PassengerCarriage{" + "carriageType=" + carriageType + ", numberOfSeats=" + numberOfSeats +
                ", baggageWeight=" + baggageWeight + '}';
    }
}
