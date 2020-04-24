package ru.job4j.oop;

/**
 * Jukebox
 * @author Evgeniy Lymar
 */
public class Jukebox {
    /**
     * Method music in jukebox
     * @param position music position
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
            }
        }

    /**
     * Method main play music according to position.
     * @param args args
     */
    public static void main(String[] args) {
        Jukebox marshall = new Jukebox();
        marshall.music(1);
        marshall.music(2);
        marshall.music(3);
    }
}
