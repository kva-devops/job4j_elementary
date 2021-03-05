package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    // point x1: 0, y1: 0, x2: 2, y2: 0, dist: 2.0
    @Test
    public void when00To20Then2Dot0() {
        int inX1 = 0;
        int inX2 = 2;
        int inY1 = 0;
        int inY2 = 0;
        double expected = 2.0;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }

    // point x1: 10, y1: 25, x2: 20, y2: 34, dist: 13.45
    @Test
    public void when1025To2034Then13Dot45() {
        int inX1 = 10;
        int inX2 = 20;
        int inY1 = 25;
        int inY2 = 34;
        double expected = 13.45;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }

    // point x1: 100, y1: 150, x2: 450, y2: 850, dist: 782.62
    @Test
    public void when100150To450850Then782Dot62() {
        int inX1 = 100;
        int inX2 = 450;
        int inY1 = 150;
        int inY2 = 850;
        double expected = 782.62;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
}