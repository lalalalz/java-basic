package com.company.객체와_자료구조.pp;

import java.util.NoSuchElementException;

public class Geometry {

    private double PI = 3.14;

    public double area(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return circle.radius * circle.radius * PI;
        }

        if (shape instanceof Square) {
            Square square = (Square) shape;
            return square.width * square.height;
        }

        // 타입 추가 시 기존 메서드 코드의 변경이 발생함
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.height * rectangle.width;
        }

        throw new NoSuchElementException();
    }

    // 새로운 메서드를 추가하는 것은 기존 메서드의 영향을 주지 않음!
    public double perimeter(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return 2 * circle.radius * PI;
        }

        if (shape instanceof Square) {
            Square square = (Square) shape;
            return 2 * square.width * square.height;
        }

        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return 2 * rectangle.height * rectangle.width;
        }

        throw new NoSuchElementException();
    }
}
