package com.company.bazlur.javaProgramming.chap12;

import java.util.ArrayList;
import java.util.Arrays;

public class Facebook {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Shoaib", Gender.MALE, 21, "Shoaib@gmail.com"));
        users.add(new User("Sayem", Gender.MALE, 30, "Sayem@gmail.com"));
        users.add(new User("Sourav", Gender.MALE, 26, "Sourav@gmail.com"));
        users.add(new User("Nur", Gender.MALE, 11, "Nur@gmail.com"));

        User.addFriend(users.get(1));

        Status status = new Status();
        status.status("What's up everyone.");

        User.comment("Good. How are you?");

       for (User user : users) {
           System.out.println(user);
       }

        System.out.println(status);
    }
}
