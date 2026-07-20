package loop_based_problems;
import java.util.Scanner;
public class LC2_ACT1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        long temp = Math.abs(number);
        int count = 0;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
        }
        System.out.println("The output is " + count + " digits");
        scanner.close();
    }

}
