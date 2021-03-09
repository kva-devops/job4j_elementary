package ru.job4j.array;

import org.junit.Assert;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int[] expected = new int[] {0, 1, 4};
        int[] out = Square.calculate(3);
        Assert.assertThat(out, is(expected));
    }

    @Test
    public void whenBound5Then014916() {
        int[] expected = new int[] {0, 1, 4, 9, 16};
        int[] out = Square.calculate(5);
        Assert.assertThat(out, is(expected));
    }
}