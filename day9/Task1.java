import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
class Cylinder{
    int redius;
    int height;
    Cylinder(){
        ;
    }
    Cylinder(int redius,int height){
        this.redius=redius;
        this.height=height;
    }
    public void setparameter(int a,int b){
        this.redius=a;
        this.height=b;
    }
    public int getRedius(){
        return redius;
    }
    public int getHeight(){
        return height;
    }

    public double surfacearea(){
        return 2*3.142*redius*redius + 2*3.142*redius*height;
    }

    public double volume(){
        return 3.142*redius*redius*height;
    }


}
class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        length=4;
        breadth=5;
    }
    Rectangle(int customLength, int customBreadth) {
        length = customLength;
        breadth = customBreadth;
    }

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
class Sphere{
    int radius;
    public void setparameter1(int d){
        radius=d;
    }
    public int getRadius(){
        return radius;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task1
        Cylinder cli=new Cylinder();
        cli.setparameter(10,20);
        System.out.println(cli.getRedius());
        System.out.println(cli.getHeight());

        //task2
        System.out.println(cli.surfacearea());
        System.out.println(cli.volume());

        //task3
        Cylinder clp=new Cylinder(30,40);
        System.out.println(clp.getRedius());
        System.out.println(clp.getHeight());

        //task4
         Rectangle rec=new Rectangle(8,9);
         rec.getLength();
         rec.getBreadth();

         //task5

        Sphere sp=new Sphere();
        sp.setparameter1(10);
        System.out.println(sp.getRadius());

    }

}
