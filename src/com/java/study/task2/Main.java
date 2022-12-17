package com.java.study.task2;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Casper", 2010,true);
        Animal animal2 = new Animal("Casper", 2011, true);
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println("They're equality: " + animal1.equals(animal2));
        System.out.println("Animal1 HashCode is: " + animal1.hashCode());
        System.out.println("Animal2 HashCode is: " + animal2.hashCode());
    }
}
