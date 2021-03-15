package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Frank";
        names[1] = "Ulric";
        names[2] = "Cristina";
        names[3] = "Konstantin";
        for (String namesCell : names) {
            System.out.println(namesCell);
        }
    }

}
