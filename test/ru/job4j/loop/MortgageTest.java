package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class MortgageTest {

    @Test
    public void when1year() {
        int expected = 1;
        int out = Mortgage.year(1000, 1200, 1);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when2year() {
        int expected = 2;
        int out = Mortgage.year(100, 120, 50);
        Assert.assertEquals(expected, out);
    }
}