package folder0.folder1.folder2;
import java.util.*;

class Calculator {
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
public class Practice3 {
    public static void main(String[] args) {
        Calculator cal1=new Calculator();
        cal1.add(1,2);
        cal1.multiply(4,3);
        ScCalculator cal2=new ScCalculator();
        cal2.type();
        cal2.add(3,4);
        HybridCalculator cal3=new HybridCalculator();
        cal3.type();
        cal3.add(3,4);

    }
}
