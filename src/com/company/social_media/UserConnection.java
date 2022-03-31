package com.company.social_media;

import java.util.HashMap;
import java.util.Map;

public class UserConnection {
    Map<User, User> friends = new HashMap<>();

    public UserConnection() {
    }

    public UserConnection(Map<User, User> friends) {
        this.friends = friends;
    }

    public Map<User, User> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "UserConnection{" +
                "friends=" + friends +
                '}';
    }
}
