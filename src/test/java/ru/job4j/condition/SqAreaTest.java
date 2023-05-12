package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double s = SqArea.square(p, k);
        Assert.assertEquals(expected, s, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double s = SqArea.square(p, k);
        Assert.assertEquals(expected, s, 0.01);
    }

    @Test
    public void whenP12K1Square9() {
        int expected = 9;
        int p = 12;
        double k = 1;
        double s = SqArea.square(p, k);
        Assert.assertEquals(expected, s, 0.01);
    }
}