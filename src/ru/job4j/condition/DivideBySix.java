package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
        String result;
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                result = "Number divided by six";
            } else {
                result = "Number divided by three but it's odd number";
            }
        } else {
            if (number % 2 == 0) {
                result = "Number not divided by three, but it's even number";
            } else {
                result = "Number not divided by three and it's odd number";
            }
        }
        return result;
    }
}