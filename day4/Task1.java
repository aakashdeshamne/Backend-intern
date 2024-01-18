import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //task1

        int a=10;
        if(a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }

        //task2

        System.out.println("Please enter how many marks you have:");
        int outof= scanner.nextInt();
        int[] mark=new int[3];
        int sum=0;

        for(int i=0;i<3;i++){
            System.out.println("Enter the marks of subject:"+i+1);
            mark[i]= scanner.nextInt();
            sum+=mark[i];
        }
        for(int i=0;i<mark.length;i++){
            if((mark[i]/outof)*100 <33 || sum/3<40){
                System.out.println("you are failed in exam");
            }
            else{
                System.out.println("congratulation you are pass");
            }
        }

        //task3
        float tax=0;
        System.out.println("please enter your salary");
        float salary= scanner.nextInt();
        if(salary<2.5f){
            tax=tax+0;
        }
        else if(salary>2.5f||salary<5.0f){
            tax=tax+(salary-2.5f)*0.05f;
        }
        else if(salary>5.0f||salary<10.0f){
            tax=tax+(5.0f-2.5f)*0.05f;
            tax=tax+(salary-2.5f)*0.05f;

        }
        else if(salary>10.0f){
            tax=tax+(5.0f-2.5f)*0.05f;
            tax=tax+(10.f-5.0f)*0.2f;
            tax=tax+(salary-10.f)*0.3f;

        }
        System.out.println(tax);


        //task4
        System.out.println("please enter the number");
        int day= scanner.nextInt();
        switch (day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("tuesday");
           case 3-> System.out.println("wensday");
           case 4-> System.out.println("Thusday");
           case 5-> System.out.println("friday");
           case 6-> System.out.println("saterday");
           case 7-> System.out.println("sunday");
        }

        //task5
        System.out.println("Please ehter the year");
        int year= scanner.nextInt();
        if(year%4==0){
            System.out.println("Given year is leap year");
        }
        else{
            System.out.println("Given year is not leap year");
        }

        //task6

        System.out.println("please enter your website url");
        String url= scanner.next();
        if(url.endsWith(".org")){
            System.out.println("This is organization website");
        }
        else if(url.endsWith(".com")){
            System.out.println("This is commercial website");
        }
        else if(url.endsWith(".in")){
            System.out.println("this is an indian website");
        }



    }

}
