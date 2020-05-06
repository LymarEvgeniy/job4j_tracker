package ru.job4j.tracker;

import java.util.Random;
import java.util.Arrays;

/**
 * Tracker
 * @author Evgeniy Lymar.
 */
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int size = 0;

    /**
     * Метод добавление заявки в хранилище.
     * @param item новая заявка.
     * @return заявка.
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[size++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * @return уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод проверяет имена на совпадение.
     * @param key аргумент сравнения.
     * @return возвращант совпадающие имена в новом массиве.
     */
    public Item[] findByName(String key) {
        int count = 0;
        Item[] result = new Item[size];
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (name.getName().equals(key)) {
                result[count++] = name;
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Метод возвращает копию массива без null элементов.
     * @return массив без null элементов.
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    /**
     * Метод сравнивает id с аргументом.
     * @param id аргумент для сравнения.
     * @return найденый аргумент.
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}