package com.company.socket_programming.chat_application;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class NetworkConnection {
    Socket socket;
    ObjectInputStream ois;
    ObjectOutputStream oos;

    public NetworkConnection(Socket socket) throws IOException {
        this.socket = socket;
        oos = new ObjectOutputStream(socket.getOutputStream());
        ois = new ObjectInputStream(socket.getInputStream());
    }

    public NetworkConnection(String ip, int port) throws IOException {
        socket = new Socket(ip, port);
        oos = new ObjectOutputStream(socket.getOutputStream());
        ois = new ObjectInputStream(socket.getInputStream());
    }

    public void write(Object obj) {
        try {
            oos.writeObject(obj);
        } catch (IOException e) {
            System.out.println("Failed to write");
        }
    }

    public Object read() {
        Object obj;
        try {
            obj = ois.read();
        } catch (IOException e) {
            System.out.println("Failed to read");
            return null;
        }
        return obj;
    }

    public Socket getSocket() {
        return socket;
    }
}
