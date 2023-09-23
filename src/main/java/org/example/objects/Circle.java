package org.example.objects;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;

    public Circle(Point origin, double radius) {
        super(origin);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public String toString(){
        return "I am a circle. My radius is: "+radius + ".\nThat means my area is: " + getArea();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        System.err.println("A circle has a circumference, and not a perimeter!");
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public double getCircumference() {
        return getDiameter() * Math.PI;
    }
}
