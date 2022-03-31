package com.company.social_media;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        UserList userList = new UserList();

        userList.users.add(new User("Nur", "Bangladesh", 10, Gender.MALE));
        userList.users.add(new User("Starc", "Australia", 32, Gender.MALE));
        userList.users.add(new User("Ana", "USA", 30, Gender.FEMALE));
        userList.users.add(new User("Sam", "UK", 22, Gender.MALE));
        userList.users.add(new User("Nia", "Canada", 18, Gender.FEMALE));

        UserConnection userConnection = new UserConnection();
        userConnection.friends.put(userList.users.get(1), userList.users.get(2));
        userConnection.friends.put(userList.users.get(0), userList.users.get(4));
        userConnection.friends.put(userList.users.get(0), userList.users.get(2));
        userConnection.friends.put(userList.users.get(1), userList.users.get(3));
        userConnection.friends.put(userList.users.get(3), userList.users.get(2));

        System.out.println(userConnection);
    }
}
