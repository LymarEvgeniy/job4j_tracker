package ru.job4j.oop;

/**
 * BallStory
 * @author Evgeniy Lymar
 */
public class BallStory {
    /**
     * Method main tells a fairy tale ball
     * @param args args
     */
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.tryEat(ball);
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
