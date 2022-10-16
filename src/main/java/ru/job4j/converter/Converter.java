package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(720);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("730 rubles are " + dollar + " dollar.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2.0 euro Test result : " + passed);
        in = 720;
        expected = 12;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("720 rubles are 12.0 dollar Test result : " + passed);
    }
}
