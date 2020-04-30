package ru.job4j.profession;

public class Programmer extends Engineer {
    private String writePrograms;
    private String codeSupport;

    public Programmer(String name, String surname, String education, String birthday) {
        super("Василий", "Пупкин", "Высшее", "05.12.1990");
    }
    public Programmer(String writePrograms, String codeSupport) {
        super("SkyNen");
        this.writePrograms = writePrograms;
        this.codeSupport = codeSupport;
    }

    public String getWritePrograms() {
        return writePrograms;
    }
    public String getCodeSupport() {
        return codeSupport;
    }
    public Programmer limited() {
        return null;
    }


}
