package ru.job4j.oop;

/**
 * Cat
 * @author Evgeniy Lymar
 */
public class Cat {

    /**
     * food field
     */
    private String food;

    /**
     * name field
     */
    private String name;

    /**
     * Method show. When is called, the name of the cat is displayed on the console and what he ate.
     */
    public void show() {
        System.out.println(this.name + " " + this.food);
    }

    /**
     * Method eat
     * @param meat What cat eat.
     */
    public void eat(String meat) {
        this.food = meat;
    }
    /**
     * Method giveNick
     * @param nick cat name
     */
   public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * Method main display the name of the cat on the console and what he ate.
     * @param args args
     */
    public static void main(String[] args){
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("gav");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black");
        black.show();
    }
}
