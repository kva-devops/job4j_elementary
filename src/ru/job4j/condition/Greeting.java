package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {

        int year = 2020;
        String idea = "I like Java! ";

        System.out.println(idea);
        // add some text and integer variable
        idea += "But I am a newbie. ";
        idea += year;
        System.out.println(idea);
    }
}
