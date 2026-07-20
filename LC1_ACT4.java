//LC 1 ACTIVITY 4 EVEN OR ODD PROGRAM
import java.util.Scanner;
public class LC1_ACT4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("The number is Zero.");
        } 
        else if (number % 2 == 0) {
            System.out.println("The number is Even.");
        } 
        else {
            System.out.println("The number is Odd.");
        }
        scanner.close();
    }
}


