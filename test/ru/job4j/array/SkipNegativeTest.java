package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skipYes2x2() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] result = SkipNegative.skip(in);
        Assert.assertThat(result, is(expect));
    }

    @Test
    public void skipYes2x4() {
        int[][] in = {
                {1, -2, 4, 0},
                {1, 2, -4, -1}
        };
        int[][] expect = {
                {1, 0, 4, 0},
                {1, 2, 0, 0}
        };
        int[][] result = SkipNegative.skip(in);
        Assert.assertThat(result, is(expect));
    }
}