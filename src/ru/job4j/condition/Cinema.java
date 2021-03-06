package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
            if (age >= 18) {
                System.out.println("Access permitted. Welcome to the cinema!");
            } else {
                System.out.println("Access deny! Go out!");
            }
    }

    public static void main(String[] args) {
        Cinema.access(13);
        Cinema.access(34);
    }

}
