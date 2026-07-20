package loop_based_problems;
import java.util.Scanner;
public class LC2_ACT3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.print("Enter a decimal integer: ");
        int decimal = scanner.nextInt();
        if (decimal == 0) {
            System.out.println("Binary representation: 0");
        } else {
            StringBuilder binary = new StringBuilder();
            int temp = decimal;
            while (temp > 0) {
                int remainder = temp % 2;
                binary.insert(0, remainder); // Prepend the remainder
                temp = temp / 2;
            }
            System.out.println("Binary representation: " + binary.toString());
        }
        scanner.close();
    }

}
