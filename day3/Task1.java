import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task1
        String a="AAKASH";
        String b=a.toLowerCase();
        System.out.println(b);

        //task2

        String c="hello world";
        String d=c.replace(' ','_');
        System.out.println(d);

        //task3

        String letter="Dear name , Thanks a lot";
        String resultletter=letter.replaceAll("name","Akash");
        System.out.println(resultletter);

        //task4

        String inputString="This  a   lot";
        if (inputString.contains("  ")) {
            System.out.println("Double spaces detected.");
        } else {
            System.out.println("No double spaces found.");
        }

        if (inputString.contains("   ")) {
            System.out.println("Triple spaces detected.");
        } else {
            System.out.println("No triple spaces found.");
        }

        //task5
        String randomletter="Dear Harry, This Java Course is nice Thanks";
        System.out.println("Formatted Letter:\n" +randomletter);

    }

}
