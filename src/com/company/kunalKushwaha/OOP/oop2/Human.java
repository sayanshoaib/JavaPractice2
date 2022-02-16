package com.company.kunalKushwaha.OOP.oop2;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    static long population;

    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        this.population += 1;
    }

    void greeting() {
        System.out.println("Hello");
    }

    void message() {
        greeting();
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", isMarried=" + isMarried +
                '}';
    }
}
