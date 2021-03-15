package ru.job4j.converter;

public class Converter {
    public static int rubToEur(int value) {
        return value / 70;
    }

    public static int eurToRub(int value) {
        return value * 70;
    }

    public static int rubToDol(int value) {
        return value / 60;
    }

    public static int dolToRub(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubToEur(in);
        boolean passed = expected == out;
        System.out.println("Testing: rubToEur(). Test result: " + passed);
        in = 2;
        expected = 140;
        out = Converter.eurToRub(in);
        passed = expected == out;
        System.out.println("Testing: eurToRub(). Test result: " + passed);
        in = 120;
        expected = 2;
        out = Converter.rubToDol(in);
        passed = expected == out;
        System.out.println("Testing: rubToDol(). Test result: " + passed);
        in = 2;
        expected = 120;
        out = Converter.dolToRub(in);
        passed = expected == out;
        System.out.println("Testing: dolToRub(). Test result: " + passed);
    }
}