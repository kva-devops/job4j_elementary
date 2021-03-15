package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        return length * height;
    }

    public static void main(String[] args) {
        System.out.println("Square rectangular is  " + SqArea.square(6, 2));
        System.out.println("Square rectangular is  " + SqArea.square(10, 3));
        System.out.println("Square rectangular is  " + SqArea.square(8, 4));
    }
}
