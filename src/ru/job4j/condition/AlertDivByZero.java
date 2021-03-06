package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-3);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by zero!");
        } else if (number < 0) {
            System.out.println(number + " is negative number.");
        } else {
            System.out.println(number + " is positive number.");
        }
    }
}
