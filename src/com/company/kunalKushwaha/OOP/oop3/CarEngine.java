package com.company.kunalKushwaha.OOP.oop3;

public class CarEngine implements Engine {

    @Override
    public void bmwEngine(String performance) {
        System.out.println("BMW Engine Performance: " + performance);
    }

    @Override
    public void mercedezEngine(String performance) {
        System.out.println("Mercedez Benz Performance: " + performance);
    }
}
