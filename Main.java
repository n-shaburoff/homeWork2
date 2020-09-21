package com.prog_kiev;

public class Main {

    public static void main(String[] args) {
	    Point a = new Point(0,0);
	    Point b = new Point(0,4);
	    Point c = new Point(3,4);
	    Point d = new Point(3,0);

	    Triangle triangle = new Triangle(a, b, c);
	    Rectangle rect = new Rectangle(a,b,c,d);


	    Shape shape1 = triangle;
	    Shape shape2 = rect;
		Board my_board = new Board();
		double area =  shape2.getArea();
		System.out.println(area);
		my_board.addFigure(shape1);
		my_board.addFigure(shape2);
		System.out.println(my_board);

		System.out.println(my_board.geTotalArea());

    }
}
