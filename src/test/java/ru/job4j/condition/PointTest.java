package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when512to1014then5dot38() {
        double expected = 5.38;
        Point a = new Point(5, 12);
        Point b = new Point(10, 14);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when69to4038then44dot68() {
        double expected = 44.68;
        Point a = new Point(6, 9);
        Point b = new Point(40, 38);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when711to918then7dot28() {
        double expected = 7.28;
        Point a = new Point(7, 11);
        Point b = new Point(9, 18);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}