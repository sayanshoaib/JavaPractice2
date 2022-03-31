package com.company.social_media;

import java.util.ArrayList;

public class UserList {
    ArrayList<User> users = new ArrayList<>();

    public UserList() {
    }

    public UserList(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "UserList{" +
                "users=" + users +
                '}';
    }
}
