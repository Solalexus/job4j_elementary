package ru.job4j.array;

public class HelloWorld {
    public static String checkNumber(int number) {
        String result = "Operation not support";
        if (number % 3 == 0 && number % 5 == 0) {
            return "Hello, World!!!";
        }
        if (number % 3 == 0) {
            return "Hello";
        }
        if (number % 5 == 0) {
            return "World";
        }
        return result;
    }
}
