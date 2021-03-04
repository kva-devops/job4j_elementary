package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double sPmtr = (a + b + c) / 2;
        return  Math.sqrt(sPmtr * (sPmtr - a) * (sPmtr - b) * (sPmtr - c));

    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area(2, 2, 2) is " + result);
    }
}
