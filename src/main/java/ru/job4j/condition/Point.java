package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double raznostX = x2 - x1;
        double raznostY = y2 - y1;
        double stepenX = Math.pow(raznostX, 2);
        double stepenY = Math.pow(raznostY, 2);
        double summaXY = stepenX + stepenY;
        return Math.sqrt(summaXY);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(46, 21, 18, 34);
        System.out.println("result (46, 21) to (18, 34) " + result);
        result = Point.distance(156, 221, 97, 221);
        System.out.println("result (156, 221) to (97, 221) " + result);
        result = Point.distance(2159, 4987, 5612, 3211);
        System.out.println("result (2159, 4987) to (5612, 3211) " + result);
        result = Point.distance(169, 27, 12, 3500);
        System.out.println("result (169, 27) to (12, 3500) " + result);
    }
}
