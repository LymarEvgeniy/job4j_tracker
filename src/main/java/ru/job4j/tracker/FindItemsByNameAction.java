package ru.job4j.tracker;

public class FindItemsByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find item by name.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find Item by Name ===");
        String name = input.askStr("Enter name: ");
        Item[] foundName = tracker.findByName(name);
        if (foundName.length != 0) {
            for (int index = 0; index < foundName.length; index++) {
                System.out.println("Find name: " + foundName[index].getName() + "\n" + "With id: " + foundName[index].getId());
            }
        } else { System.out.println("Name do't found");
        }
        return true;
    }
}
