package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (result == 0) {
                result = ++i;
            } else {
                result *= i;
            }
        }
        return result;
    }
}
