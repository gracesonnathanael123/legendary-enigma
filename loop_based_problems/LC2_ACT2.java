package loop_based_problems;
import java.util.Scanner;
public class LC2_ACT2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        long temp = Math.abs(number);
        long sum = 0;
        while (temp > 0) {
            long lastDigit = temp % 10; 
            sum += lastDigit;           
            temp = temp / 10;           
        }
        System.out.println("The output is " + sum);
        scanner.close();
    }
}
