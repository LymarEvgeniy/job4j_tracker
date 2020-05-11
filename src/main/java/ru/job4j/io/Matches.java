package ru.job4j.io;

import java.util.Scanner;

public class Matches {
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
        if (player) {
            System.out.println("Выиграл Игрок 2");
        } else {
            System.out.println("Выиграл Игрок 1");
        }
    }
}