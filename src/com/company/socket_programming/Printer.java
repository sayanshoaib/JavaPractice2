package com.company.socket_programming;

public class Printer {
    synchronized void printAssignment(Person person) {
        System.out.println("Printing started...");
        System.out.println("Printing ended...");
        for (int i = 0; i < person.pages; i++) {
            System.out.println(person.name + "--> Printed page# " + (i + 1));
        }
        System.out.println("Printing ended...");
    }
}
