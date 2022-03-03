package com.company.socket_programming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread implements Runnable {
    Socket clientSocket;
    Thread thread;

    public ServerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        try {
            Scanner reply = new Scanner(System.in);
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());

            while (true) {
                //read from client...
                Object cMsg = ois.readObject();
                if (cMsg == null) {
                    break;
                }
                System.out.println("From Client: " + (String) cMsg);

                System.out.println("Give reply: ");
                String serverMsg = reply.nextLine();
                //serverMsg = serverMsg.toUpperCase();

                //send to client...
                oos.writeObject(serverMsg);
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
