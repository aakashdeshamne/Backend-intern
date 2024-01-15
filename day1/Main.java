import java.util.*;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner it=new Scanner(System.in);
      //practice set task1
       int a=10;
        int b=10;
        int c=10;
        int d=a+b+c;
        System.out.println(d);

        //practice set task2
        float e=70;
        float f=70;
        float g=70;
        float h=70;
        float i=(e+f+g+h)/40;
        System.out.println(i);

        //practice set task3
        String name=it.nextLine();
        System.out.println("hey"+name+"have a good day");

        //practice set task4

        float kilometer=it.nextFloat();
        System.out.println(0.62137119*kilometer);

        //practice set task5

        System.out.println("Enter a number:");

        try {

            int number = it.nextInt();
            System.out.println("You entered an integer: " + number);
        } catch (InputMismatchException err) {

            System.out.println("Invalid input. Please enter an integer.");
        } finally {

            it.close();
        }


    }
}