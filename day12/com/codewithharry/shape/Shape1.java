package com.codewithharry.shape;
class Shape {
    int length, breadth, radius;

    Shape(int length, int breadth, int radius) {
        this.length = length;
        this.breadth = breadth;
        this.radius = radius;
    }

    public int getLength() {
        return this.length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Shape myShape = new Shape(5, 8, 3);
        myShape.setLength(10);
        myShape.setBreadth(6);
        myShape.setRadius(4);
        System.out.println("Modified Length: " + myShape.getLength());
        System.out.println("Modified Breadth: " + myShape.getBreadth());
        System.out.println("Modified Radius: " + myShape.getRadius());
    }
}
