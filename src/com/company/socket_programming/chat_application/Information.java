package com.company.socket_programming.chat_application;

public class Information {
    public String username;
    public NetworkConnection netConnection;
    public Information(String user, NetworkConnection nConnection){
        username=user;
        netConnection=nConnection;
    }
}
