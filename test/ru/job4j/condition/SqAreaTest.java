package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    // perimeter = 6, coefficient = 2, Expect square = 2.0
    @Test
    public void whenP6K2ThenSquare2Dot0() {
        double inP = 6.0;
        double inK = 2.0;
        double expected = 2.0;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }

    // perimeter = 10, coefficient = 3, Expect square = 4.68
    @Test
    public void whenP10K3ThenSquare4Dot68() {
        double inP = 10.0;
        double inK = 3.0;
        double expected = 4.68;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }

    // perimeter = 8, coefficient = 4, Expect square = 2.56
    @Test
    public void whenP8K4ThenSquare2Dot56() {
        double inP = 8.0;
        double inK = 4.0;
        double expected = 2.56;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }
}