package ru.job4j.array;

import java.util.Arrays;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int pointNull = index;
                // find not null element and compare with null elem
                for (int i = pointNull + 1; i < array.length; i++) {
                    if (array[i] != array[pointNull]) {
                        // swap null element and not null
                        swap(array, pointNull, i);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    // method for swap element of array

    public static String[] swap(String[] array, int nullIndex, int notNullIndex) {
        String temp = array[notNullIndex];
        array[notNullIndex] = array[nullIndex];
        array[nullIndex] = temp;
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
