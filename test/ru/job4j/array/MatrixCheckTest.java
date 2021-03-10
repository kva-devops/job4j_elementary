package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontalTrue() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontalFalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'Y', 'X'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        Assert.assertThat(result, is(true));
    }
}