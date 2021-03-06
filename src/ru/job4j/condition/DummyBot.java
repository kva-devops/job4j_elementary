package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "I don't know what you need. Ask me something else.";
        if ("Hello, bot".equals(question)) {
            rsl = "Hello, smart gay!";
        } else if ("Good bye".equals(question)) {
            rsl = "Bye!";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hello, bot");
        System.out.println(rsl);
        rsl = DummyBot.answer("Good bye");
        System.out.println(rsl);
        rsl = DummyBot.answer("Who are you?");
        System.out.println(rsl);
    }
}
