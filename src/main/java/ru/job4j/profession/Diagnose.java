package ru.job4j.profession;

public class Diagnose extends Patient {
    private String diagnose;

    public Diagnose() {
        super();
    }
    public Diagnose(String diagnose) {
        super("Искревление перегородки носа");
        this.diagnose = diagnose;
    }

    public Patient establishingDiagnosis() {
        return null;
    }
}