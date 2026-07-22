package array_based_problems;

import java.util.Scanner;

public class LC3_ACT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 30;
        int[] marks = new int[N];
        int[] rangeCount = new int[10];

        System.out.println("Enter marks for " + N + " students (0 to 100):");

        for (int i = 0; i < N; i++) {
            marks[i] = sc.nextInt();

            if (marks[i] >= 0 && marks[i] <= 100) {
                if (marks[i] == 0) {
                    rangeCount[0]++;
                } else {
                    int bucket = (marks[i] - 1) / 10;
                    rangeCount[bucket]++;
                }
            }
        }

        System.out.println("\nStudents count in specific ranges:");

        for (int i = 0; i < 10; i++) {
            int lowerBound = (i == 0) ? 0 : (i * 10 + 1);
            int upperBound = (i + 1) * 10;

            System.out.println(lowerBound + "% to " + upperBound + "%: "
                    + rangeCount[i] + " student(s)");
        }

        sc.close();
    }
}