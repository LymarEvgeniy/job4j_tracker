package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findAllItemWithoutNullElements() {
        Tracker tracker = new Tracker();
        Item name = new Item("test1");
        Item name1 = new Item("test2");
        Item name2 = new Item("test3");
        tracker.add(name);
        tracker.add(name1);
        tracker.add(name2);
        assertThat(tracker.findAll(), is(new Item[]{name, name1, name2}));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test2");
        tracker.add(item);
        Item[] result = tracker.findByName("test2");
        assertThat(result, is(new Item[]{item}));
    }

    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getId(), is(item.getId()));
    }
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}
