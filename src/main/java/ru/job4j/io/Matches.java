package ru.job4j.io;

import java.util.Scanner;

/**
 * Matches
 * @author Evgeniy lymar.
 */
public class Matches {
    /**
     * Method main implements a game of 11 matches.
     * @param args args.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        boolean player = true;
        while (matches > 0) {
            System.out.println("Количество спичек на столе: " + matches);
            if (player) {
                System.out.println("Берет спички Игрок 1");
            } else {
                System.out.println("Берет спички Игрок 2");
            }
            System.out.print("Выберите количество спичек от 1 до 3: \n");
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("Введите число от 1 до 3");
                continue;
            }
            matches -= select;
            System.out.println();
            player = !player;
        }
        System.out.println(String.format("Выиграл Игрок %d", player ?  2 : 1));
    }
}