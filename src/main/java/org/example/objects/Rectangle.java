package org.example.objects;

import java.util.Objects;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(Point origin, double length, double width) {
        super(origin);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return "I am a rectangle. My length is: " + length + " and my width is: " + width + ".\nThat means my area is: " + getArea();
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getCircumference() {
        System.out.println("A rectangle has a perimeter, and not a circumference!");
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}
