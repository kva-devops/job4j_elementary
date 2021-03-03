package ru.job4j.calculator;

public class Fit {
    // method for calculate optimal weight of man
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }
    // method for calculate optimal weight of woman
    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }
    // start program
    public static void main(String[] args) {
        short your_height = 177;
        double man = Fit.manWeight(your_height);
        System.out.println("Man " + your_height + " is " + man + " kg");
        double woman = Fit.womanWeight(your_height);
        System.out.println("Woman " + your_height + " is " + woman + " kg");
    }
}
