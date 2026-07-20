package loop_based_problems;
import java.util.Scanner;
public class LC2_ACT5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int divisor = 2;
        boolean f = false;
        if (number <= 1) {
            System.out.println("No exact divisor exists for numbers less than or equal to 1.");
        } else {
            while (divisor <= number) {
                if (number % divisor == 0) {
                    System.out.println("The smallest exact divisor other than one is: " + divisor);
                    f = true;
                    break;
                }
                divisor++;
            }
        }
        scanner.close();
    }

}
