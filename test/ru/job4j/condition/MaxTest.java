package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int a = 1, b = 2;
        int expected = 2;
        int out = Max.max(a, b);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax3To2Then3() {
        int a = 3, b = 2;
        int expected = 3;
        int out = Max.max(a, b);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax2To2Then2() {
        int a = 2, b = 2;
        int expected = 2;
        int out = Max.max(a, b);
        Assert.assertEquals(expected, out);
    }
}