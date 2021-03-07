package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class LogicNotTest {

    @Test
    public void when2IsEvenThenTrue() {
        int in = 2;
        boolean expected = true;
        boolean out = LogicNot.isEven(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when3IsPositiveThenTrue() {
        int in = 3;
        boolean expected = true;
        boolean out = LogicNot.isPositive(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when3IsNotEvenThenTrue() {
        int in = 3;
        boolean expected = true;
        boolean out = LogicNot.notEven(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMinus5IsNegativeThenTrue() {
        int in = -5;
        boolean expected = true;
        boolean out = LogicNot.notPositive(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when7IsNotEvenAndIsPositiveThenTrue() {
        int in = 7;
        boolean expected = true;
        boolean out = LogicNot.notEven(in) && LogicNot.isPositive(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMinus5IsEvenOrNotPositiveThenTrue() {
        int in = -5;
        boolean expected = true;
        boolean out = LogicNot.isEven(in) || LogicNot.notPositive(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when4IsEvenOrNotPositiveThenTrue() {
        int in = 4;
        boolean expected = true;
        boolean out = LogicNot.isEven(in) || LogicNot.notPositive(in);
        Assert.assertEquals(expected, out);
    }
}