package ru.job4j.profession;

public class Dentist extends Doctor {
    private String treatsTeeth;

    public Dentist(String name, String surname, String education, String birthday) {
        super("Сергей", "Сидоров", "Высшее", "10.06.1973");
    }

    public Dentist(String treatsTeeth) {
        super("Стоматолог");
        this.treatsTeeth = treatsTeeth;
    }
    public String getTreatsTeeth() {
        return treatsTeeth;
    }
    public Dentist drill() {
        return null;
    }
}
