//LC1 ACTIVITY 5 SUM OF THREE NUMBERS PROGRAM
import java.util.Scanner;
public class LC1_ACT5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        double sum = num1 + num2 + num3;
        System.out.println("The resultant sum is: " + sum);
        scanner.close();
    }
}


