package ru.job4j.tracker;

public class ReplaceItemAction implements UserAction {
    @Override
    public String name() {
        return "Edit item.";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Replace Item ====");
        String id = input.askStr("Enter id: ");
        String newName = input.askStr("Enter new name: ");
        Item editItem = new Item(newName);
        System.out.println(tracker.replace(id, editItem) ? "Application changed successfully" : "Request change error");
        return true;
    }
}
