package ru.job4j.profession;
public class Profession {

    private String name;
    private String surname;
    private String education;
    private String birthday;

    public  Profession() {
        super();
    }
    public Profession(String name, String surname, String education, String birthday) {
        super();
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEducation() {
        return education;
    }
    public String getBirthday() {
        return birthday;
    }
}
