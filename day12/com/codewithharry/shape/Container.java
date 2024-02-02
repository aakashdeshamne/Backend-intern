package com.codewithharry.shape;
class Rectangle extends Shape{

    Rectangle(int length , int breadth){
        super(length, breadth,-1);
    }

    public int area(){
        return this.length*this.breadth;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        System.out.println("The area of rectangle is: "+rectangle.area());
    }
}


class Square extends Shape{

    Square(int length){
        super(length, -1,-1);
    }

    public int area(){
        return this.length*this.length;
    }
}


class Circle extends Shape{

    Circle(int radius){
        super(-1, -1,radius); //-1 means using it on behalf of null value we don't require length and breadth here
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}


class Cylinder extends Shape{

    Cylinder(int length,int radius){
        super(length, -1,radius);  // consider length as height of cylinder
    }

    public double area(){
        return (2*Math.PI*this.radius*this.length) + (2*Math.PI*this.radius*this.radius); //2πrh+2πr2
    }

    // How to use this code
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3, 5);
        System.out.println(cylinder.area());
    }

}
public class Container {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Square
        Square square = new Square(5);
        System.out.println("Area of Square: " + square.area());

        // Circle
        Circle circle = new Circle(3);
        System.out.println("Area of Circle: " + circle.area());

        // Cylinder
        Cylinder cylinder = new Cylinder(3, 5);
        System.out.println("Area of Cylinder: " + cylinder.area());
    }
}
