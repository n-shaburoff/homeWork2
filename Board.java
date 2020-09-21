package com.prog_kiev;

import java.util.Arrays;

public class Board {
    private Shape[] shapes;

    public Board() {
        shapes = new Shape[4];
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public String toString() {
        return "Board{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }

    public void addFigure(Shape figure) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                shapes[i] = figure;
                break;
            }
        }
    }

    public void removeFigure(Shape figure){
        for (int i = 0; i < shapes.length; i++){
            if (shapes[i] == figure){
                shapes[i] = null;
                break;
            }
        }
    }

    public double geTotalArea(){
        double area = 0;
        for (int i = 0; i < shapes.length; i++){
            if(shapes[i] != null) {
                area += shapes[i].getArea();
            }
        }
        return area;
    }

}