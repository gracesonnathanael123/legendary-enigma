package searching_sorting_based;
import java.util.Scanner;
public class LC5_ACT4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];

        System.out.println("Enter 15 elements for the array:");
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the number X to search for: ");
        int x = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("Number " + x + " found at index position: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number " + x + " does not occur in the array.");
        }
        scanner.close();
    }

}
