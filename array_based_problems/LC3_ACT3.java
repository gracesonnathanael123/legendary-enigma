package array_based_problems;

import java.util.Scanner;

public class LC3_ACT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // Reverse the array
        for (int i = 0; i < 10 / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[9 - i];
            numbers[9 - i] = temp;
        }

        System.out.println("Reversed array:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
