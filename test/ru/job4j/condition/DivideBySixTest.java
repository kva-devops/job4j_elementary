package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DivideBySixTest {

    @Test
    public void whenNumberDividedBy6() {
        String expected = "Number divided by six";
        String out = DivideBySix.checkNumber(24);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        String expected = "Number divided by three but it's odd number";
        String out = DivideBySix.checkNumber(9);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        String expected = "Number not divided by three, but it's even number";
        String out = DivideBySix.checkNumber(14);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        String expected = "Number not divided by three and it's odd number";
        String out = DivideBySix.checkNumber(25);
        Assert.assertEquals(expected, out);
    }
}