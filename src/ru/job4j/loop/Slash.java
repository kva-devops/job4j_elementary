package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        if (size % 2 == 0 || size < 2) {
            System.out.printf("%d is wrong size\n", size);
            return;
        } else {
            System.out.printf("Draw by %d\n", size);
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean left = i == j;
                boolean right = i == size - 1 - j;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        draw(5);
        draw(3);
        draw(7);
        draw(0);
        draw(1);
        draw(8);

    }
}
