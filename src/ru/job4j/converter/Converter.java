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
        int yourCurrency = 100;
        System.out.println(yourCurrency + " Rub is " + rubToEur(yourCurrency) + " Euro");
        System.out.println(yourCurrency + " Euro is " + eurToRub(yourCurrency) + " Rub");
        System.out.println(yourCurrency + " Rub is " + rubToDol(yourCurrency) + " Dollar");
        System.out.println(yourCurrency + " Dollar is " + dolToRub(yourCurrency) + " Rub");
    }
}