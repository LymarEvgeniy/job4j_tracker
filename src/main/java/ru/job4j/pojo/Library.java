package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book gingerbread = new Book("Колобок", 15);
        Book primer = new Book("Букварь", 23);
        Book recipes = new Book("Рецепты", 254);
        Book cleanCode = new Book("Clean code", 464);
        Book[] book = new Book[] {gingerbread, primer, recipes, cleanCode};

        for (int i = 0; i < book.length; i++) {
            Book books = book[i];
            System.out.println(books.getName() + " - " + books.getNumbersPages() + "стр.");
        }
        System.out.println("Перестановка книг с индексом 0 и 3.");
        Book temp = book[0];
        book[0] = book[3];
        book[3] = temp;
        for (int i = 0; i < book.length; i++) {
            Book books = book[i];
            System.out.println(books.getName() + " - " + books.getNumbersPages() + "стр.");
        }
        System.out.println("Вывод книг с именем Clean code.");
        for (int i = 0; i < book.length; i++) {
            Book books = book[i];
            if(books.equals(cleanCode)) {
                System.out.println(books.getName() + " - " + books.getNumbersPages() + "стр.");
            }
        }
    }
}
