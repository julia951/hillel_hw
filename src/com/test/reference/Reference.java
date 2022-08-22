package com.test.reference;

public class Reference {

    public static void main(String[] args) {
        Person olga = new Person();
        olga.name = "Olga";
        olga.age = 10;

        Person inna = new Person();
        inna.name = "Inna";
        inna.age = 15;

        System.out.println("Olga age is: " + olga.age + ", Inna age is: " + inna.age);

        swapAge(olga, inna);

        System.out.println("Olga age is: " + olga.age + ", Inna age is: " + inna.age);
    }

    private static void swapAge(Person olga, Person inna) {
        int tempAge = olga.age;
        olga.age = inna.age;
        inna.age = tempAge;
    }


    static class Person {
        String name;
        int age;
    }
}
