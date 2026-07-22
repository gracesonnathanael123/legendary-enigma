package string_based_probems;

import java.util.Scanner;

public class LC4_ACT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GRACESON NATHANAEL J URK23CS1068");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        boolean vowelFound = false;

        for (int i = 0; i < chars.length; i++) {
            char c = Character.toLowerCase(chars[i]);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                chars[i] = 'z'; // Replace vowel with 'z'
                vowelFound = true;
            }
        }

        String result = new String(chars);

        if (vowelFound) {
            System.out.println("Modified string: " + result);
        } else {
            System.out.println(result + " (No vowels present)");
        }

        scanner.close();
    }
}