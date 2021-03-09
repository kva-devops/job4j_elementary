package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        // sorting one element
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        // sorting all element
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int elem = array[i + 1];
                array[i + 1] = array[i];
                array[i] = elem;
            }
        }
        // prints arrays
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
