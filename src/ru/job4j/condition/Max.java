package ru.job4j.condition;

public class Max {

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(a, b) >= c ? max(a, b) : c;
    }
}
