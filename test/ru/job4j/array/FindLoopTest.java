package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int out = FindLoop.indexOf(input, value);
        int expected = 0;
        Assert.assertThat(out, is(expected));
    }
}