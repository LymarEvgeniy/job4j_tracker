package ru.job4j.oop;

/**
 * DummyDic
 * @author Evgeniy Lymar
 */
public class DummyDic {
    /**
     * Method engToRus
     * @param eng word that DummyDic does't know
     * @return return unknown words
     */
    public String engToRus(String eng) {
        String voice = "Неизвестное слово" + eng;
        return voice;
    }
    /**
     * Method main displays unknown words
     * @param args args
     */
    public static void main(String[] args) {
        DummyDic pol = new DummyDic();
        String say = pol.engToRus(" Plunger");
        System.out.println(say);
    }
}
