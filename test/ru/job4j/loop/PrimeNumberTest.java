package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int expected = 3;
        int out = PrimeNumber.calc(5);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when11() {
        int expected = 5;
        int out = PrimeNumber.calc(11);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when2() {
        int expected = 1;
        int out = PrimeNumber.calc(2);
        Assert.assertEquals(expected, out);
    }
}