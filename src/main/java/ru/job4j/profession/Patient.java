package ru.job4j.profession;

public class Patient extends Doctor {
    private String complaint;
    private String name;
    private String surname;
    private int age;

    public Patient() {
        super();
    }
    public Patient(String name, String surname, int age) {
        super();
    }

    public Patient(String complaint) {
        super();
        this.complaint = complaint;
    }
    public Surgeon whatWorries() {
        return null;
    }
    public Dentist teeth() {
        return null;
    }
}