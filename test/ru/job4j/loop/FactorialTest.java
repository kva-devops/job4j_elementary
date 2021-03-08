package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenNum5ThenFactIs120() {
        int out = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNum7ThenFactIs5040() {
        int out = Factorial.calc(7);
        int expected = 5040;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNum0ThenFactIs1() {
        int out = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNum1ThenFactIs1() {
        int out = Factorial.calc(1);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }
}