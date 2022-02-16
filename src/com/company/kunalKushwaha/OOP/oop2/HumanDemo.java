package com.company.kunalKushwaha.OOP.oop2;

import java.util.ArrayList;

public class HumanDemo {
    public static void main(String[] args) {
        Human shoaib = new Human(21, "Shoaib", 10000, false);
        Human sayem = new Human(30, "Sayem", 8000000, true);
        Human sourav = new Human(30, "Sourav", 4000000, false);


        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        message();
        shoaib.message();
        HumanDemo hd = new HumanDemo();
        hd.greeting();

        long num = Human.population;
        System.out.println(num);
        ArrayList<Human> person = new ArrayList<>();
        person.add(shoaib);
        person.add(sayem);
        person.add(sourav);
        System.out.println(person.toString());

    }

    void greeting() {
        System.out.println("Hello");
    }

    static void message() {
        HumanDemo humanDemo = new HumanDemo();
        humanDemo.greeting();
    }
}
