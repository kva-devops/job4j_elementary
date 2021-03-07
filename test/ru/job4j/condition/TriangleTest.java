package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExistTriangleTrue() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean expected = true;
        boolean out = Triangle.exist(ab, ac, bc);
        Assert.assertEquals(expected, out);

    }
}