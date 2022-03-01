package com.company.kunalKushwaha.OOP.oop3;

public class CarDemo {
    public static void main(String[] args) {
        Car ferrari = new Car(new CarEngine(), new CarWheels());
        ferrari.carEngine.mercedezEngine("Great");
        ferrari.carWheels.mrfWheels(15000);
    }
}
