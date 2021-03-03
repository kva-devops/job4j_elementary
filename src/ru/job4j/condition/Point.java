package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Point.distance(0, 0, 2, 0));
        System.out.println(Point.distance(10, 25, 20, 34));
        System.out.println(Point.distance(100, 150, 450, 850));
    }
}
