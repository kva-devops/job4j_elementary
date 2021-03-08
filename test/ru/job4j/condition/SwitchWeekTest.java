package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void when1nameOfDayThenMonday() {
        String expected = "Monday";
        String out = SwitchWeek.nameOfDay(1);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when4nameOfDayThenThursday() {
        String expected = "Thursday";
        String out = SwitchWeek.nameOfDay(4);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when12nameOfDayThenError() {
        String expected = "Error name, try again";
        String out = SwitchWeek.nameOfDay(12);
        Assert.assertEquals(expected, out);
    }
}