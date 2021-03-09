package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        // fills array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        // prints array
        for (int elementArr : numbers) {
            System.out.println(elementArr);
        }
    }
}
