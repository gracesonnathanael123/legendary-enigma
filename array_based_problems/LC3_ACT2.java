package array_based_problems;
import java.util.Scanner;
public class LC3_ACT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] numbers = new int[20];
        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
            if (num < min1) {
                min3 = min2;
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min3 = min2;
                min2 = num;
            } else if (num < min3) {
                min3 = num;
            }
        }
        System.out.println("Maximum 3 elements: " + max1 + ", " + max2 + ", " + max3);
        System.out.println("Minimum 3 elements: " + min1 + ", " + min2 + ", " + min3);
        sc.close();
	}

}
