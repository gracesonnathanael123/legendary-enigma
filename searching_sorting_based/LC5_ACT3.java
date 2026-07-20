package searching_sorting_based;
import java.util.Scanner;
public class LC5_ACT3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[25];
        System.out.println("Enter 25 integers:");
        for (int i = 0; i < 25; i++) {
            array[i] = scanner.nextInt();
        }
        int maxVal = array[0];
        int firstPos = 0;
        int lastPos = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
                firstPos = i;
                lastPos = i;  
            } else if (array[i] == maxVal) {
                lastPos = i;  
            }
        }
        System.out.println("\nMaximum Value: " + maxVal);
        System.out.println("Occurs first at index position: " + firstPos);
        System.out.println("Occurs last at index position: " + lastPos);
        scanner.close();
    }

}
