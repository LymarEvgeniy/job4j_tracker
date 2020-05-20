package ru.job4j.poly;

public class Bus implements Transport {

    private int stop = 0;
    private int quantity = 0;
    @Override
    public void drive() {
        stop++;

    }

    @Override
    public void passengers(int quantity) {
        this.quantity += quantity;

    }

    @Override
    public double fill(int fuel) {
        return fuel * 42.45;
    }
}
