package ru.job4j.array;

public class ReversLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Current element from the end: "
                                    + numbers[numbers.length - 1 - i]);
            }
        }
    }
}
