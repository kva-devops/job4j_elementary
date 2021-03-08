package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumFrom1To10Then30() {
        int out = Counter.sumByEven(1, 10);
        int expected = 30;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSumEvenNumFrom100To400Then37750() {
        int out = Counter.sumByEven(100, 400);
        int expected = 37750;
        Assert.assertEquals(expected, out);
    }
}