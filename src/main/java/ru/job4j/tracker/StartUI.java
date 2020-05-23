package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findAllItem(Input input, Tracker tracker) {
        System.out.println("=== All Item in system ====");
        Item[] items = tracker.findAll();
        if (items.length != 0) {
            for (int index = 0; index < items.length; index++) {
                System.out.println("Item name: " + items[index].getName() + "\n" + "Item id: " + items[index].getId());
            }
        } else {
            System.out.println("Items not found");
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Replace Item ====");
        String id = input.askStr("Enter id: ");
        String newName = input.askStr("Enter new name: ");
        Item editItem = new Item(newName);
        System.out.println(tracker.replace(id, editItem) ? "Application changed successfully" : "Request change error");
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ====");
        String id = input.askStr("Enter id: ");
        System.out.println(tracker.delete(id) ? "Application successfully deleted" : "Error deleting application");
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find Item by id ====");
        String id = input.askStr("Enter id: ");
        Item findId = tracker.findById(id);
        if (findId != null) {
            System.out.println("Find name: " + findId.getName() + "\n" + "With id: " + findId.getId());
        } else {
            System.out.println("ID do't found");
        }
    }

    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("=== Find Item by Name ====");
        String name = input.askStr("Enter name: ");
        Item[] foundName = tracker.findByName(name);
        if (foundName != null) {
            for (int index = 0; index < foundName.length; index++) {
                System.out.println("Find name: " + foundName[index].getName() + "\n" + "With id: " + foundName[index].getId());
            }
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr(""));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItem(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemsByName(input, tracker);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}