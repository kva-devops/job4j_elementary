package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
            if (age >= 18) {
                System.out.println("Access permitted. Welcome to the cinema!");
            } else {
                System.out.println("Access deny! Go out!");
            }
    }

    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }

}
