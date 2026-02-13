package LeetcodeProblems;
import java.util.Scanner;


public class array1 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = x.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        x.close();
    }
}
