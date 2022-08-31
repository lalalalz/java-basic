package com.company.객체와_자료구조.oop;

public class Circle implements Shape {

    private double radius;
    private static final double PI = 3.14;

    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
