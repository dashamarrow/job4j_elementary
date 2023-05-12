package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

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
    public void when512to1014then5dot38() {
        double expected = 5.38;
        int x1 = 5;
        int y1 = 12;
        int x2 = 10;
        int y2 = 14;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when69to4038then44dot68() {
        double expected = 44.68;
        int x1 = 6;
        int y1 = 9;
        int x2 = 40;
        int y2 = 38;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when711to918then7dot28() {
        double expected = 7.28;
        int x1 = 7;
        int y1 = 11;
        int x2 = 9;
        int y2 = 18;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}