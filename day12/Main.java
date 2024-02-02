package calculatorapp;
import java.util.*;

 class Calculator {

     int p=10;
     protected int a=10;
     public void type(){
         System.out.println("");
     }
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

}


class ScCalculator {
    public void type(){
        System.out.println("This is Scientific Calculator");
    }
    public int add(int a, int b) {
        return a + b;
    }

}


class HybridCalculator{
    public void type(){
        System.out.println("This is Hybrid Calculator");    }
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //task 1

        Calculator cal1=new Calculator();
        cal1.add(1,2);
        cal1.multiply(4,3);
        ScCalculator cal2=new ScCalculator();
        cal2.type();
        cal2.add(3,4);
        HybridCalculator cal3=new HybridCalculator();
        cal3.type();
        cal3.add(3,4);

        //task2

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scan.nextLine();
        System.out.println("hello"+ name +"How are you");
        scan.close();


    }
}