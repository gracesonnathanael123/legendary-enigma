package string_based_probems;

import java.util.Scanner;

public class LC4_ACT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GRACESON NATHANAEL J URK23CS1068");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean[] visited = new boolean[input.length()];

        System.out.println("Output:");

        for (int i = 0; i < input.length(); i++) {
            if (visited[i]) {
                continue;
            }

            char currentChar = input.charAt(i);
            int count = 1;

            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(currentChar + " - " + count);
        }

        scanner.close();
    }
}