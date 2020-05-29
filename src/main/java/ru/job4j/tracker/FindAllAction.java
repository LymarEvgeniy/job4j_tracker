package ru.job4j.tracker;

public class FindAllAction implements UserAction{
    @Override
    public String name() {
        return "Show all items.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== All Item in system ====");
        Item[] items = tracker.findAll();
        if (items.length != 0) {
            for (int index = 0; index < items.length; index++) {
                System.out.println("Item name: " + items[index].getName() + "\n" + "Item id: " + items[index].getId());
            }
        } else {
            System.out.println("Items not found");
        }
        return true;
    }
}
