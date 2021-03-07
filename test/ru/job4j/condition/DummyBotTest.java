package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {

    @Test
    public void questionHelloAnswerHello() {
        String in = "Hello, bot";
        String expected = "Hello, smart gay!";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void questionGoodbyeAnswerGoodbye() {
        String in = "Good bye";
        String expected = "Bye!";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void questionSomethingAnswerError() {
        String in = "Something text";
        String expected = "I don't know what you need. Ask me something else.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }
}