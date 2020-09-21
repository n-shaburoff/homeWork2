package com.prog_kiev;

public class Triangle extends Shape{
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }


    @Override
    public double getPerimetr() {
        double ab = Point.calculateDist(a, b);
        double bc = Point.calculateDist(b, c);
        double ca = Point.calculateDist(c, a);
        double per = ab + bc + ca;
        return per;
    }

    @Override
    public double getArea() {
        double ab = Point.calculateDist(a, b);
        double bc = Point.calculateDist(b, c);
        double ca = Point.calculateDist(c, a);
        double p = (ab + bc + ca)/2;
        double area = Math.sqrt(p*(p - ab)*(p - bc)*(p - ca));
        return area;
    }
}
