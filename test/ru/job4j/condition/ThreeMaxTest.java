package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int out = ThreeMax.max(10, 5, 1);
        Assert.assertEquals(10, out);
    }

    @Test
    public void secondMax() {
        int out = ThreeMax.max(10, 50, 1);
        Assert.assertEquals(50, out);
    }

    @Test
    public void thirdMax() {
        int out = ThreeMax.max(1, 5, 100);
        Assert.assertEquals(100, out);
    }

    @Test
    public void allEq() {
        int out = ThreeMax.max(1, 1, 1);
        Assert.assertEquals(1, out);
    }

    @Test
    public void firstEqSecond() {
        int out = ThreeMax.max(10, 10, 1);
        Assert.assertEquals(10, out);
    }

    @Test
    public void firstEqThird() {
        int out = ThreeMax.max(100, 1, 100);
        Assert.assertEquals(100, out);
    }

    @Test
    public void secondEqThird() {
        int out = ThreeMax.max(1, 100, 100);
        Assert.assertEquals(100, out);
    }
}