import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
class Employee{
    String name;
    int salary;
    int id;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }

    public void setsalary(int p){
        salary=p;
    }

}
class Cellphone{
    public void ringing(){
        System.out.println("ringing");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
}
class Square{
    int side;
    public void setSide(int side){
        this.side=side;
    }
    public int getarea(){
        return (side*side);
    }
    public int parameter(){
        return (side*4);
    }
}
class Rectangle{
    int length;
    int breadth;
    public void setSide(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getarea(){
        return (length*breadth);
    }
    public int parameter(){
        return 2*(length+breadth);
    }
}
class Tommyvecetti{
    public void hitting(){
        System.out.println("hitting");
    }
    public void running(){
        System.out.println("running");
    }
    public void firing(){
        System.out.println("firing");
    }
}
class Circle{
    int redius;
    public void setRedius(int redius){
        this.redius=redius;
    }
    public double getarea(){
        return (3.142*redius*redius);
    }
    public double parameter(){
        return (2*3.142*redius);
    }
}
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task1
        Employee akash=new Employee();
        akash.id=100;
        akash.setsalary(50000);
        akash.setname("aakash");
        System.out.println(akash.getname());
        System.out.println(akash.id);
        System.out.println(akash.getsalary());

        //task2
        Cellphone mycell=new Cellphone();
        mycell.ringing();
        mycell.vibrating();

        //task3
        Square sqr=new Square();
        sqr.setSide(10);
        System.out.println(sqr.parameter());
        System.out.println(sqr.getarea());

        //task4
        Rectangle rec=new Rectangle();
        rec.setSide(10,20);
        System.out.println(rec.parameter());
        System.out.println(rec.getarea());

        //task5

        Tommyvecetti tom=new Tommyvecetti();
        tom.firing();
        tom.running();
        tom.hitting();

        //task6
        Circle cer=new Circle();
        cer.setRedius(10);
        System.out.println(cer.getarea());
        System.out.println(cer.parameter());


    }

}
