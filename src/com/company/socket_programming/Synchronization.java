package com.company.socket_programming;

public class Synchronization {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Person shoaib  = new Person("Shoaib", printer, 5);
        Person nur  = new Person("Nur", printer, 10);
        Person simpu  = new Person("Simpu", printer, 5);
    }
}
