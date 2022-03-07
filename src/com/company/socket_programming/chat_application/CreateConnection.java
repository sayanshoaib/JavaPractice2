package com.company.socket_programming.chat_application;

import com.company.socket_programming.ReaderThread;

import java.util.HashMap;

public class CreateConnection implements Runnable {

    HashMap<String, Information> clientList;
    NetworkConnection nc;

    public CreateConnection(HashMap<String, Information> clientList, NetworkConnection nc) {
        this.clientList = clientList;
        this.nc = nc;
    }

    @Override
    public void run() {
        try {
            Object userObj = nc.read();
            String username = (String) userObj;

            System.out.println("User: " + username + " connected");

            clientList.put(username, new Information(username, nc));
            System.out.println("HashMap updated " + clientList);
            new Thread(new ReaderWriterServer(username, nc, clientList)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
