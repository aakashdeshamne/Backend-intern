import java.util.Scanner;

public class Thread1 extends Exception {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //task1:-

        // Syntax Error: int a=20

        int age=78;
        int yearBorn=2000-78;   // Logical Error

        System.out.println(6/0);   //Runtime Error


        //task2:-



        try {

            int result = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("haha");
        }

        try {

            validateArgument(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("hehe");
        }


        //task3:-



        int[] arr={1,2,3,4,5,6,7,8};

        System.out.println("what element you want to access in the given array");
        int a=scanner.nextInt();
        try {
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }



        //task4:-



        int[] arr1={1,2,3,4,5,6,7,8};

        System.out.println("what element you want to access in the given array");

        int b=scanner.nextInt();

        try {
            if (b < 0 || b >= arr.length) {
                throw new Thread1("Custom Exception: Index out of bounds");
            }
            System.out.println(arr[b]);
        } catch (Thread1 e) {
            System.out.println(e.getMessage());
        }


        //task5


        try {
            method(arr, b);
        } catch (Thread1 e) {
            System.out.println(e.getMessage());
        }



    }

    // Function for Task 2:
    private static void validateArgument(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Negative value is not allowed in the Program");
        }
    }

    private  static void method(int[] arr,int index) throws Thread1{
        if (index < 0 || index >= arr.length) {
            throw new Thread1("Custom Exception: Index out of bounds");
        }
        System.out.println(arr[index]);
    }

    public Thread1(String message){
        super(message);
    }

}
