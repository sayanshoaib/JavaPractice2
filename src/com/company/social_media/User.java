package com.company.social_media;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String country;
    private int age;
    private Gender gender;

    public User() {
    }

    public User(String name, String country, int age, Gender gender) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.gender = gender;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
