package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when73to1226then23dot54() {
        double expected = 23.54;
        int x1 = 7;
        int y1 = 3;
        int x2 = 12;
        int y2 = 26;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3083to49121then42dot49() {
        double expected = 42.49;
        int x1 = 30;
        int y1 = 83;
        int x2 = 49;
        int y2 = 121;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when261to7419then51dot26() {
        double expected = 51.26;
        int x1 = 26;
        int y1 = 1;
        int x2 = 74;
        int y2 = 19;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}