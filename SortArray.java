import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of strings
        System.out.print("\nEnter the number of strings: ");
        int numStrings = scanner.nextInt();
        String[] strArr = new String[numStrings];

        // Consume newline character
        scanner.nextLine();

        // Prompt user to enter the strings
        System.out.println("Enter " + numStrings + " strings:");
        for (int i = 0; i < numStrings; i++) {
            strArr[i] = scanner.nextLine();
        }

        // Sort the array of strings
        sortStrings(strArr);

        // Display the sorted array of strings
        System.out.println("Sorted strings: " + Arrays.toString(strArr));

        // Close scanner
        scanner.close();
    }

    // Method to sort an array of strings
    public static void sortStrings(String[] arr) {
        Arrays.sort(arr);
    }
}
