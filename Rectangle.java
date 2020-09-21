package com.prog_kiev;

public class Rectangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Rectangle() {
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    @Override
    public double getPerimetr() {
        double ab = Point.calculateDist(a, b);
        double bc = Point.calculateDist(b, c);
        double per = (ab + bc) * 2;
        return per;
    }

    @Override
    public double getArea() {
        double weigth = Point.calculateDist(a, b);
        double height = Point.calculateDist(a, d);
        double area = weigth * height;
        return area;
    }
}

