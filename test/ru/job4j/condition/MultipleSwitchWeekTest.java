package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayNumberOfDay1() {
        int expected = 1;
        int out = MultipleSwitchWeek.numberOfDay("Monday");
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFridayNumberOfDay5() {
        int expected = 5;
        int out = MultipleSwitchWeek.numberOfDay("Friday");
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenWednesdayRusNumberOfDay3() {
        int expected = 3;
        int out = MultipleSwitchWeek.numberOfDay("Среда");
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenErrordayNumberOfDayMinus1() {
        int expected = -1;
        int out = MultipleSwitchWeek.numberOfDay("Neverday");
        Assert.assertEquals(expected, out);
    }
}