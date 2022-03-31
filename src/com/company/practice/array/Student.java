package com.company.practice.array;

public class Student {
    private String name;
    private int id;
    private String department;
    private double cgpa;

    public Student() {
    }

    public Student(String name, int id, String department, double cgpa) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
