package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CheckPrimeNumberTest {

    @Test
    public void whenNumIs5ThenTrue() {
        boolean expected = true;
        boolean out = CheckPrimeNumber.check(5);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumIs4ThenFalse() {
        boolean expected = false;
        boolean out = CheckPrimeNumber.check(4);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumIs1ThenFalse() {
        boolean expected = false;
        boolean out = CheckPrimeNumber.check(1);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumIs0ThenFalse() {
        boolean expected = false;
        boolean out = CheckPrimeNumber.check(0);
        Assert.assertEquals(expected, out);
    }
}