package searching_sorting_based;
import java.util.Scanner;
public class LC5_ACT5 {
	public static void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int m = scanner.nextInt();
        int[] array1 = new int[m];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < m; i++) array1[i] = scanner.nextInt();
        System.out.print("Enter size of second array: ");
        int n = scanner.nextInt();
        int[] array2 = new int[n];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) array2[i] = scanner.nextInt();
        sortDescending(array1);
        sortDescending(array2);
        int[] array3 = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (array1[i] >= array2[j]) {
                array3[k++] = array1[i++];
            } else {
                array3[k++] = array2[j++];
            }
        }
        while (i < m) {
            array3[k++] = array1[i++];
        }
        while (j < n) {
            array3[k++] = array2[j++];
        }

        System.out.println("\nMerged Descending Array:");
        for (int num : array3) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }

}
