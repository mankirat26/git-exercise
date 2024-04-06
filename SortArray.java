import java.util.Arrays;
import java.util.Scanner;


public class SortArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of integers
        System.out.print("Enter the number of integers: ");
        int numIntegers = scanner.nextInt();
        int[] intArr = new int[numIntegers];

        // Prompt user to enter the integers
        System.out.println("Enter " + numIntegers + " integers:");
        for (int i = 0; i < numIntegers; i++) {
            intArr[i] = scanner.nextInt();
        }

        // Sort the array of integers
        sortIntegers(intArr);


        // Close scanner
        scanner.close();
    }

    // Method to sort an array of integers
    public static void sortIntegers(int[] arr) {
        Arrays.sort(arr);
    }
}

