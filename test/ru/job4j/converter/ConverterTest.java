package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RubThen2Eur() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubToEur(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert5EurThen350Rub() {
        int in = 5;
        int expected = 350;
        int out = Converter.eurToRub(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RubThen3Dol() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubToDol(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert1000DolThen60000Rub() {
        int in = 1000;
        int expected = 60000;
        int out = Converter.dolToRub(in);
        Assert.assertEquals(expected, out);
    }
}