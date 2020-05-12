package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                    System.out.println("=== All Item in system ====");
                    Item[] items = tracker.findAll();
                    if (items.length != 0) {
                    for (int index = 0; index < items.length; index++) {
                        System.out.println("Item name: " + items[index].getName() + "\n" + "Item id: " + items[index].getId());
                    }
                    } else {
                        System.out.println("Items not found");
                    }
            } else if (select == 2) {
                System.out.println("=== Replace Item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                Item editItem = new Item(newName);
                System.out.println(tracker.replace(id, editItem) ? "\n" + "Application changed successfully" : "\n" + "Request change error");
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.println(tracker.delete(id) ? "Application successfully deleted" : "\n" + "Error deleting application");
            } else if (select == 4) {
                System.out.println("=== Find Item by id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item findId = tracker.findById(id);
                if (findId != null) {
                    System.out.println("Find name: " + findId.getName() + "\n" + "With id: " + findId.getId());
                } else {
                    System.out.println("ID do't found");
                }
            } else if (select == 5) {
                System.out.println("=== Find Item by Name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] foundName = tracker.findByName(name);
                    if (foundName != null) {
                        for (int index = 0; index < foundName.length; index++) {
                            System.out.println("Find name: " + foundName[index].getName() + "\n" + "With id: " + foundName[index].getId());
                        }
                    }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}