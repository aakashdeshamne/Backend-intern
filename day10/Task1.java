import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
class Circle {
    int radius = 20;
    public Circle(int radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return 3.142 * radius * radius;
    }

    public void print() {
        System.out.println("Circle: ");
        System.out.println("Radius: " + radius);
    }
}

class Cylinder1 extends Circle {
    int height = 10;
    public Cylinder1(int radius, int height) {
        super(radius);
        this.height = height;
    }
    public double calculateVolume() {
        return calculateArea() * height;
    }

    public void print() {
        System.out.println("Cylinder1: ");
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
    }
}
class Rectangle {
     double length;
     double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double calculateArea() {
        return length * width;
    }
    public void display() {
        System.out.println("Rectangle:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public double calculateVolume() {
        return super.calculateArea() * height;
    }

    public void display() {
        super.display(); 
        System.out.println("Cuboid:");
        System.out.println("Height: " + height);
    }
}

class Base {
    Base() {
        System.out.println("Base Constructor");
    }
}

class Derive1 extends Base {
    Derive1() {
        System.out.println("Derive1 Constructor");
    }
}

class Derive2 extends Derive1 {
    Derive2() {
        System.out.println("Derive2 Constructor");
    }
}



public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task1
        Circle circle = new Circle(30);
        Cylinder1 cylinder = new Cylinder1(25, 12);

        circle.print();
        System.out.println();
        cylinder.print();

        //task2
        Rectangle rectangle = new Rectangle(5, 10);
        Cuboid cuboid = new Cuboid(3, 4, 6);


        rectangle.display();
        System.out.println();
        cuboid.display();

        //task3
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Area: " + cylinder.calculateArea());
        System.out.println("Volume: " + cylinder.calculateVolume());

        //task4

        System.out.println("Area"+ rectangle.calculateArea());
        System.out.println("Volume"+cuboid.calculateVolume());

        //task5
        Derive2 obj = new Derive2();

        //Answer:  Constructure of base class will be executed first then derive1 class constructed then derived2 class will be executed

    }

}
