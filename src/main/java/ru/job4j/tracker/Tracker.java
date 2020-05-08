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
     *
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
     *
     * @return уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод проверяет имена на совпадение.
     *
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
     *
     * @return массив без null элементов.
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    /**
     * Метод сравнивает id с аргументом.
     *
     * @param id аргумент для сравнения.
     * @return найденый аргумент.
     */
    public Item findById(String id) {
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items[index] : null;
    }

    /**
     * Метод возвращает индекс заявки по идентификатору заявки (id)
     * @param id идентификатору заявки.
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод заменяет заявку.
     * @param id идентификатор заявки.
     * @param item новая заявка.
     */
    public boolean replace(String id, Item item) {
        items[indexOf(id)] = item;
        item.setId(id);
        return true;
    }

    /**
     * Метод удаляет заявку.
     * @param id идентификатор заявки.
     */
    public boolean delete(String id) {
        System.arraycopy(items, indexOf(id) + 1, items, indexOf(id), size - indexOf(id));
        items[size - 1] = null;
        size--;
        return true;
    }
}