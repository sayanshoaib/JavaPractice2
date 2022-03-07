package com.company.socket_programming;

import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderThread implements Runnable {
    ObjectInputStream ois;
    String name;

    public ReaderThread(ObjectInputStream ois, String name) {
        this.ois = ois;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                // receive from server...
                Object received = ois.readObject();
                System.out.println(name + " Got: " + (String) received);
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
