import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task1
        System.out.println("Please Enter the Number you want");
        int a= scanner.nextInt();
        multiplication(a);

        //task2
        System.out.println("Please Enter the Number you want");
        int b= scanner.nextInt();
        pattern1(b);

        //task3
        System.out.println("Please Enter the Number you want");
        int c= scanner.nextInt();
        System.out.println(sumnatural(c));


        //task4
        System.out.println("Please Enter the Number you want");
        int d= scanner.nextInt();
        pattern2(d);

        //task5
        System.out.println("Please Enter the Number you want");
        int e= scanner.nextInt();
        System.out.println(fibonacci(e));

        //task6
        float average=calaverage(1,2,3,4,5,6,7,8,9);
        System.out.println(average);

        //task7
        System.out.println("Please Enter the Number you want");
        int f= scanner.nextInt();
        pattern3(f);



        

    }
    public static void multiplication(int a){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d",a,i,a*i);
        }
    }
    public static void pattern1(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int a){
        for(int i=a;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int sumnatural(int a){
        if(a==1){
            return 1;
        }
        else{
            return a+sumnatural(a-1);
        }

    }
    public static int fibonacci(int a){
        if(a<=1){
            return 1;
        }
        else{
            return fibonacci(a-1)+fibonacci(a-2);
        }
    }
    public static float calaverage(float... a){
        if(a.length==0){
            System.out.println("no number is provided");
            return 0;
        }

            float sum=0;
            for(float g :a){
                sum += g;
            }
            float average=sum/a.length;
            return average;
    }
    public static void pattern3(int a){
       if(a==0){
           return ;
       }
       for(int i=0;i<a;i++){
           System.out.print("*");
       }
        System.out.println();
       pattern3(a-1);
    }

}
