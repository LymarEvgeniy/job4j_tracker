package ru.job4j.tracker;

public class FindItemByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by id.";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find Item by id ===");
        String id = input.askStr("Enter id: ");
        Item findId = tracker.findById(id);
        if (findId != null) {
            System.out.println("Find name: " + findId.getName() + "\n" + "With id: " + findId.getId());
        } else {
            System.out.println("ID do't found");
        }
        return true;
    }
}
