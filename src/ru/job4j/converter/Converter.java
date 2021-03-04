package ru.job4j.converter;


public class Converter {

    // method for converting rub to euro
    public static int rubToEur(int value) {
        return value / 70;
    }
    // method for converting euro to rub
    public static int eurToRub(int value) {
        return value * 70;
    }
    // method for converting rub to dollar
    public static int rubToDol(int value) {
        return value / 60;
    }
    // method for converting dollar to rub
    public static int dolToRub(int value) {
        return value * 60;
    }
    // start program
    public static void main(String[] args) {
        int your_currency = 100;
        System.out.println(your_currency + " Rub is " + rubToEur(your_currency) + " Euro");
        System.out.println(your_currency + " Euro is " + eurToRub(your_currency) + " Rub");
        System.out.println(your_currency + " Rub is " + rubToDol(your_currency) + " Dollar");
        System.out.println(your_currency + " Dollar is " + dolToRub(your_currency) + " Rub");
    }
}