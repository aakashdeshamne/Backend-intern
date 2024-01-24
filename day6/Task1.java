import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //task1
        float[] arr=new float[5];
        float sum1=0;
        for(int i=0;i<5;i++){
            arr[i]= scanner.nextInt();
            sum1+=arr[i];
        }
        System.out.println(sum1);

        //task2

        int[] arr1={1,2,3,4,5,6};
        System.out.println("enter the element you have to find");
        int element= scanner.nextInt();
        boolean found=false;
        for(int i=0;i<arr1.length;i++){
            if (arr1[i] == element) {
                found = true;
                System.out.println("Found");
            }
        }
        if (!found) {
            System.out.println("Not found");
        }


        //task3
        int[] marks={80,87,65,49,68,70};
        int sum2=0;
        for(int mark:marks){
            sum2+=mark;
        }
        System.out.println("avarage:"+sum2/marks.length);

        //task4
        int rows = 2;
        int cols = 3;

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        System.out.println("Enter elements for the first matrix:");
        inputMatrix(scanner, matrix1);

        // Input for the second matrix
        System.out.println("Enter elements for the second matrix:");
        inputMatrix(scanner, matrix2);
        int[][] resultMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Resultant Matrix after Addition:");
        displayMatrix(resultMatrix);


        //task5

        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));

        //task6

        int max=Integer.MIN_VALUE;
        int[] arr3={1,2,3,45,6,7,8,9};
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]>max){
                max=arr3[i];
            }
        }
        System.out.println(max);


        //task7

        int min=Integer.MAX_VALUE;

        int[] arr4={1,2,3,45,6,7,8,9};
        for(int i=0;i<arr3.length;i++){
            if(arr4[i]<min){
                min=arr3[i];
            }
        }
        System.out.println(min);

        //task8

        int[] arr5={1,2,3,4,5,6,7,8,9};
        if (isSorted(arr5)) {
            System.out.println("The array is sorted in ascending order.");
        }
        else {
            System.out.println("The array is not sorted in ascending order.");
        }


    }
    private static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


            start++;
            end--;
        }
    }
    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
