package com.company.bazlur.javaProgramming.chap12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class User {
    private static UUID userId = UUID.randomUUID();
    private String name;
    private Gender gender;
    private int age;
    private String email;
    private static Status status;

    public User(User user) {
    }

    public User(String name, Gender gender, int age, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void addFriend(User user) {
        Map<User, UUID> friends = new HashMap<>();
        friends.put(new User(user), userId);
    }

    public static void comment(String text) {
        Map<String, Status> comments = new HashMap<>();
        comments.put(text, status);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}
