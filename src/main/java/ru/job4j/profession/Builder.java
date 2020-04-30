package ru.job4j.profession;

public class Builder extends Engineer {
    private String reedDrawings;
    private String buildControl;

    public Builder(String name, String surname, String education, String birthday) {
        super("Артур", "Пирожков", "Высшее", "02.02.1968");
    }
    public Builder(String reedDrawings, String buildControl) {
        super("Коттеджный поселок");
        this.reedDrawings = reedDrawings;
        this.buildControl = buildControl;
    }

    public String getReedDrawings() {
        return reedDrawings;
    }
    public String getBuildControl() {
        return buildControl;
    }
    public Builder commissioning() {
        return null;
    }
}