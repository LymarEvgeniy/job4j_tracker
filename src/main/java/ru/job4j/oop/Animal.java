package ru.job4j.oop;

public class Animal {
    public Animal() {
        super();
        System.out.println("Animal");
    }
    public Animal(String name) {
        super();
        System.out.println("class Animal");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animals = new Animal("Animal");
    }
}
