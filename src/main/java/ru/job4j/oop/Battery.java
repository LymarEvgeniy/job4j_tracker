package ru.job4j.oop;

/**
 * Battery.
 * @author Evgeniy Lymsr.
 */
public class Battery {
    /**
     * load field. Contain battery capacity.
     */
    private int load;

    /**
     * Constructor Battery. Initialization of the initial of the battery.
     * @param size battery condition.
     */
    public Battery(int size) {
        this.load = size;
    }

    /**
     * Method exchange
     * @param another name of the variable with which we get the value
     */
    public void exchange(Battery another) {
        this.load = (this.load + another.load);
        another.load = 0;
    }

    /**
     * Method main. Demonstration of the exchange method
     * @param args args
     */
    public static void main(String[] args) {
        Battery first = new Battery(80);
        Battery second = new Battery(20);
        System.out.println("first :" + " " + first.load + ". second :" + " " + second.load);
        second.exchange(first);
        System.out.println("first :" + " " + first.load + ". second :" + " " + second.load);
    }
}
