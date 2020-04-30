package ru.job4j.profession;

public class Engineer extends Profession {
    private String project;

    public Engineer(String name, String surname, String education, String birthday) {
        super();
    }
    public Engineer(String project) {
        super();
        this.project = project;
    }

    public String getProject() {
        return project;
    }
    public String condition() {
        return null;
    }
}
