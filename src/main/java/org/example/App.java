package org.example;

import org.example.objects.Shape;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = Shape.listOfShapes();
        System.out.println("\n***** Unsorted list of shapes *****\n====================================");
        for (Shape s : shapes) {
            System.out.println(s.toString());
        }
        System.out.println("\n***** Shapes sorted by area *****\n====================================");
        shapes.sort(null);
        for (Shape s : shapes) {
            System.out.println(s.toString());
        }
        System.out.println("\n***** Set without duplicates *****\n====================================");
        Set<Shape> setOfShapes = new HashSet<>(shapes);
        for (Shape s : setOfShapes) {
            System.out.println(s.toString());
        }
    }
}
