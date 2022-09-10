package com.company.bazlur.pass_by_value;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Shoaib");
        System.out.println(person.toString());
        changePersonName(person);
        System.out.println(person.toString());

        int number = 10;
        System.out.println("Before changePrimitive Type function call: " + number);
        changePrimitiveType(number);
        System.out.println("After changePrimitive Type function call: " + number);

        Integer referenceTypeInt = 10;
        System.out.println("Before changeReference Type function call: " + referenceTypeInt);
        changeReferenceType(referenceTypeInt);
        System.out.println("After changeReference Type function call: " + referenceTypeInt);
    }

    public static void changePersonName(Person copyOfTheReferenceOfPersonObject) {
        copyOfTheReferenceOfPersonObject.setName("Hasan");
    }

    public static void changePrimitiveType(int value) {
        value = 5;
        System.out.println("Inside changePrimitive Type function: " + value);
    }

    public static void changeReferenceType(Integer value) {
        value = 5;
        System.out.println("Inside changeReference Type function: " + value);
    }
}
