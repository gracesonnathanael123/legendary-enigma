package loop_based_problems;
import java.util.Scanner;
public class LC2_ACT4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.print("Enter a binary representation: ");
        String binaryString = scanner.next();
        int decimal = 0;
        int power = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char bit = binaryString.charAt(i);    
            if (bit == '1') {
                decimal += Math.pow(2, power);
            } else if (bit != '0') {
                System.out.println("Invalid binary input!");
                scanner.close();
                return;
            }
            power++;
        }
        System.out.println("Corresponding decimal equivalent: " + decimal);
        scanner.close();
    }

}
