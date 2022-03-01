package com.company.kunalKushwaha.OOP.oop3;

public class Car {
    CarEngine carEngine;
    CarWheels carWheels;

    public Car() {
    }

    public Car(CarEngine carEngine, CarWheels carWheels) {
        this.carEngine = carEngine;
        this.carWheels = carWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carEngine=" + carEngine +
                ", carWheels=" + carWheels +
                '}';
    }
}
