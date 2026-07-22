package array_based_problems;

import java.util.Scanner;

public class LC3_ACT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        System.out.println("Sum of all elements = " + sum);

        sc.close();
    }
}