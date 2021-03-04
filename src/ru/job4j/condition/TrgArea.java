package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double s_pmtr = (a + b + c) / 2;
        return  Math.sqrt(s_pmtr * (s_pmtr - a) * (s_pmtr - b) * (s_pmtr - c));

    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area(2, 2, 2) is " + result);
    }
}
