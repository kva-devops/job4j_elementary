package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 5));
        System.out.println(sum(1, 50));
        System.out.println(sum(1, 500));
        System.out.println(sum(1, 5000));
        System.out.println(sum(1, 50000));
        System.out.println(sum(0, 1));
    }
}
