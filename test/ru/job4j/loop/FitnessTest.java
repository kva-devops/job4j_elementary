package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int out = Fitness.calc(95, 90);
        int expected = 0;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenIvanLessNik() {
        int out = Fitness.calc(90, 95);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenIvanLessFewNik() {
        int out = Fitness.calc(50, 90);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenIvanEqualsFewNik() {
        int out = Fitness.calc(90, 90);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }
}