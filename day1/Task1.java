import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter the total marks of this exam: ");
            int total_marks = sc.nextInt();
            System.out.print("Enter the marks in English: ");
            int a = sc.nextInt();
            System.out.print("Enter the marks in Physics: ");
            int b = sc.nextInt();
            System.out.print("Enter the marks in Chemistry: ");
            int c = sc.nextInt();
            System.out.print("Enter the marks in Biology: ");
            int d = sc.nextInt();
            System.out.print("Enter the marks in Mathematics: ");
            int e = sc.nextInt();
            float sum = (a+b+c+d+e);
            float per = (sum/total_marks)*100;
            System.out.println(name+" got "+per+" % in AISSCE.");
        }
    }
}