package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }
    public static void my_age(int age) {
        System.out.println("My age is " + age);
    }
    public static void main(String[] args) {
        String name = "Vladimir";
        int age = 33;
        ArgMethod.hello(name);
        ArgMethod.my_age(age);
    }
}
