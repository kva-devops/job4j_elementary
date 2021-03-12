package ru.job4j.sort;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenEquals() {
        int[] expect = {};
        int[] out = Machine.change(100, 100);
        Assert.assertThat(out, is(expect));
    }

    @Test
    public void when50by35() {
        int[] expect = {10, 5};
        int[] out = Machine.change(50, 35);
        Assert.assertThat(out, is(expect));
    }
}