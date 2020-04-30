package ru.job4j.profession;

public class Surgeon extends Doctor {
   private String operation;

    public Surgeon(String name, String surname, String education, String birthday) {
        super("Антон", "Иванов", "Высшее", "12.02.1983");
    }
    public Surgeon(String operation) {
        super("Пластический хирург");
        this.operation = operation;
    }
        public String getOperation() {
        return operation;
    }
    public Surgeon cut() {
        return null;
    }
}
