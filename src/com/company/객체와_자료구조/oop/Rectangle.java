package com.company.객체와_자료구조.oop;

public class Rectangle implements Shape {
    private double width;
    private double height;

    @Override
    public double perimeter() {
        return 2 * (width * height);
    }

    @Override
    public double area() {
        return width * height;
    }
}
