package string_based_probems;

import java.util.Scanner;

public class LC4_ACT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GRACESON NATHANAEL J URK23CS1068");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}