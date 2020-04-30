package ru.job4j.profession;

public class Doctor extends Profession {
    private String specialisation;

    public Doctor() {
        super();
    }

    public Doctor(String name, String surname, String education, String birthday) {
        super();
    }
    public Doctor(String specialisation) {
        super();
        this.specialisation = specialisation;
    }

    public  String getSpecialisation() {
        return specialisation;
    }

    public Diagnose heal(Patient patient) {
        return null;
    }
}

