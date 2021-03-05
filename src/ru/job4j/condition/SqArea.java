package ru.job4j.condition;

public class SqArea {
    // add method for calculate square
    // p is perimeter, k is coefficient (length is greater then height)
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        return length * height;
    }
    // start program

    public static void main(String[] args) {
        System.out.println("Square rectangular is  " + SqArea.square(6, 2));
    }
}