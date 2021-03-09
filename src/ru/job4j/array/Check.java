package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length - 1; i++) {
            boolean temp = data[0];
            if (data[i] != temp) {
                result = false;
            }
        }
        return result;
    }
}
