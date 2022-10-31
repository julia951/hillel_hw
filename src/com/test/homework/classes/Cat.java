package com.test.homework.classes;

public class Cat {


    String name;
    int age;
    int weight;
    int strength;

    public Cat() {
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setweight(int newweight) {
        this.age = newweight;
    }

    // Getter
    public int getweight() {
        return weight;
    }

    // Setter
    public void setAge(int newAge) {
        this.age = newAge;
    }

    public boolean fight(Cat anotherCat) {
        if (this.age == age && this.weight == weight && this.strength == strength) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.age = 5;
        cat1.weight = 6;
        cat1.strength = 7;

        Cat cat2 = new Cat();

        cat2.age = 5;
        cat2.weight = 6;
        cat2.strength = 7;

        System.out.print(cat1.fight(cat2));
    }

}
