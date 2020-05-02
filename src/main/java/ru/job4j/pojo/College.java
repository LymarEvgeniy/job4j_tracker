package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Алексей");
        student.setPatronymic("Владимирович");
        student.setSurname("Фадеев");
        student.setGroup("БЭА-24Д");
        student.setArrivalDate("12 июля 2014г.");

        System.out.println(student.getSurname() + " " + student.getName() + " " + student.getPatronymic() + " - " + "учащийся группы " + student.getGroup() + " с " + student.getArrivalDate());
    }
}
