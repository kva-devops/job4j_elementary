package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortFiveNumbers() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        Assert.assertThat(result, is(expect));
    }

    @Test
    public void whenSortThreeNumbers() {
        int[] input = new int[] {75, 2, 45};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 45, 75};
        Assert.assertThat(result, is(expect));
    }
}