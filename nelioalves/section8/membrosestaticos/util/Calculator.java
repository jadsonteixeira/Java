package nelioalves.section8.membrosestaticos.util; // package de utilitários

public class Calculator {

    public static final double PI = 3.14159;

    public static double cincumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
