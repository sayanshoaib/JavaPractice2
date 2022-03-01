package com.company.kunalKushwaha.OOP.oop3;

public class CarWheels implements Wheels {
    @Override
    public void mrfWheels(int runs) {
        System.out.println("MRF WHeels can run: ");
    }

    @Override
    public void cietWheels(int runs) {
        System.out.println("Ciet WHeels can run: " + runs);
    }
}
