import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //task1
        for(int i=4;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //task2
        System.out.println("Enter the first n even numbers you want:");
        int n= scanner.nextInt();
        int sum=0;
        int i=0;
        while(i<=n){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);

        //task3
        System.out.println("Enter the number you want :");
        int p= scanner.nextInt();
        for(int k=1;k<10;k++){
            System.out.printf("%d X %d = %d\n",p,k,p*k);
        }

        //task4
        int k;
        for(k=10;k>0;k--){
            System.out.printf("%d X %d = %d\n",10,k,10*k);

        }

        //task5
        System.out.println("Give the number for factorial");
        int t= scanner.nextInt();
        int fact=t;

        for(int g=t-1;g>0;g--){
            fact*=g;
        }
        System.out.println(fact);



        //task6
        int facto = t;
        int g = t - 1;

        while (g > 0) {
            facto *= g;
            g--;
        }

        System.out.println("Factorial of " + t + " is: " + facto);

        //task7

        i = 4;
        for (; i > 0; i--) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
        }


        //task8

        //Ans=True

        //task9
        int o;
        int sumo=0;
        for(o=10;o>0;o--){
            sumo+=8*o;

        }
        System.out.println(sumo);

        //task10

        //Answer=1)Atleast once

        //task11

        System.out.println("Enter the first n even numbers you want:");
        int y= scanner.nextInt();
        int sumeven=0;
        for(int f=0;f<=i;f+=2){
            sum+=f;
        }
        System.out.println(sumeven);


    }

}
