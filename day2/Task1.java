import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // task1
        float a = 7.0f / 4 * 9 / 2;
        System.out.println(a);

        // task2
        System.out.print("Enter the grade: ");
        int originalGrade = scanner.nextInt();
        int encryptedGrade = encryptGrade(originalGrade);
        System.out.println("Encrypted Grade: " + encryptedGrade);
        int decryptedGrade = decryptGrade(encryptedGrade);
        System.out.println("Decrypted Grade: " + decryptedGrade);


        //task3
        int b=10;
        System.out.println("Enter the number you want:");
        int c= scanner.nextInt();
        if(c>b){
            System.out.println("your number is greater than given");
        }
        else{
            System.out.println("your number is smaller than given");
        }

    }

    private static int encryptGrade(int grade) {
        return grade + 8;
    }

    private static int decryptGrade(int encryptedGrade) {
        return encryptedGrade - 8;
    }
}
