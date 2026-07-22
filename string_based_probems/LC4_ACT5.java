package string_based_probems;


import java.util.Scanner;

public class LC4_ACT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GRACESON NATHANAEL J URK23CS1068");

        System.out.print("Enter string1: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter string2: ");
        String string2 = scanner.nextLine();

        String reversedString2 = "";

        for (int i = string2.length() - 1; i >= 0; i--) {
            reversedString2 += string2.charAt(i);
        }

        String string3 = string1 + " " + reversedString2;

        System.out.println("string3: " + string3);

        scanner.close();
    }
}