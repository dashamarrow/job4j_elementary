package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(5, 12, 10, 14);
        System.out.println("result (5, 12) to (10, 14) " + result1);
        double result2 = Point.distance(6, 9, 40, 38);
        System.out.println("result (6, 9) to (40, 38) " + result2);
    }
}
