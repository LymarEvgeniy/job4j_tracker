package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int player = 0;
        while (matches > 0) {
            System.out.println("Количество спичек на столе: " + matches);
            if (player % 2 == 0) {
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
            player++;
            matches -= select;
            System.out.println();
        }
        if (player % 2 != 0) {
            System.out.println("Выиграл Игрок 1");
        } else {
            System.out.println("Выиграл Игрок 2");
        }
    }
}