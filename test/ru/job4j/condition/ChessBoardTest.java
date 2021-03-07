package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int x1 = 6, y1 = 7;
        int x2 = 1, y2 = 2;
        int expected = 5;
        int out = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void wayIs7() {
        int x1 = 7, y1 = 0;
        int x2 = 0, y2 = 7;
        int expected = 7;
        int out = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void wayIs0() {
        int x1 = 2, y1 = 6;
        int x2 = 4, y2 = 1;
        int expected = 0;
        int out = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, out);
    }
}