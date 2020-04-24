package ru.job4j.oop;

/**
 * Student
 * @author Evgeniy Lymar.
 */
public class Student {
    /**
     * Method music prints text on the console
     */
    public void music() {
        System.out.println("Tra, tra, tra");
    }
    /**
     * Method song prints text on the console
     */
    public void song() {
        System.out.println("I believe I can fly");
    }
    /**
     * Method main causes method music and method song several times
     * @param args args
     */
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
