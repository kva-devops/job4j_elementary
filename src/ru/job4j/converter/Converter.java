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
        // testing method rubToEur()
        int in = 140;
        int expected = 2;
        int out = Converter.rubToEur(in);
        boolean passed = expected == out;
        System.out.println("Testing: rubToEur(). Test result: " + passed);

        // testing method eurToRub()
        in = 2;
        expected = 140;
        out = Converter.eurToRub(in);
        passed = expected == out;
        System.out.println("Testing: eurToRub(). Test result: " + passed);

        // testing method rubToDol()
        in = 120;
        expected = 2;
        out = Converter.rubToDol(in);
        passed = expected == out;
        System.out.println("Testing: rubToDol(). Test result: " + passed);

        // testing method dolToRub()
        in = 2;
        expected = 120;
        out = Converter.dolToRub(in);
        passed = expected == out;
        System.out.println("Testing: dolToRub(). Test result: " + passed);
    }
}