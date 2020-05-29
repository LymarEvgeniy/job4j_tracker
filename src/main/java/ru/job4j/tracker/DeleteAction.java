package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ====");
        String id = input.askStr("Enter id: ");
        System.out.println(tracker.delete(id) ? "Application successfully deleted" : "Error deleting application");
        return true;
    }
}
