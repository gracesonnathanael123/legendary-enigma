package array_based_problems;

import java.util.Scanner;

public class LC3_ACT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 30;
        int[] marks = new int[N];
        int[] count = new int[101];

        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.println("Enter marks for " + N + " students (0 to 100):");

        for (int i = 0; i < N; i++) {
            marks[i] = sc.nextInt();

            if (marks[i] >= 0 && marks[i] <= 100) {
                count[marks[i]]++;
            }
        }

        System.out.println("\nFrequency of each mark:");

        for (int i = 0; i <= 100; i++) {
            if (count[i] > 0) {
                System.out.println("Mark " + i + ": " + count[i] + " student(s)");
            }
        }

        sc.close();
    }
}