package org.example.objects;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape implements Comparable<Shape> {
    private final Point origin;

    public Shape(Point origin) {
        this.origin = origin;
    }

    public void move(int x, int y) {
        origin.move(x, y);
    }

    public Point getOrigin() {
        return origin;
    }

    public static ArrayList<Shape> listOfShapes(){
        Point startingPointExample = new Point(1, 1);
        Circle first = new Circle(startingPointExample, 3);
        Circle firstCopy = new Circle(startingPointExample, 3);
        Rectangle second = new Rectangle(startingPointExample, 2, 2);
        Rectangle secondCopy = new Rectangle(startingPointExample, 2, 2);
        Circle third = new Circle(startingPointExample, 1);
        Shape a = Shape.createCircle(startingPointExample, 2);
        Shape b = Shape.createRectangle(startingPointExample, 4, 4);
        Shape c = new Rectangle(startingPointExample, 1,1);
        return new ArrayList<>(List.of(first, firstCopy, second, secondCopy, third, a, b, c));
    }
    public static Circle createCircle(Point origin, double radius) {
        return new Circle(origin, radius);
    }

    public static Rectangle createRectangle(Point origin, double length, double width) {
        return new Rectangle(origin, length, width);
    }
    @Override
    public int compareTo(Shape shape) {
        return Double.compare(this.getArea(), shape.getArea());
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract double getCircumference();
}
