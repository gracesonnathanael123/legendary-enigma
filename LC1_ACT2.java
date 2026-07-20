//LC 1 ACTIVITY 2 STUDENT PASS CHECKER PROGRAM
import java.util.Scanner;
public class LC1_ACT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GRACESON NATHANAEL J URK23CS1068");
        System.out.println("Student Pass Counter");
        System.out.print("Enter marks for Student 1 (0-100): ");
        int mark1 = scanner.nextInt();
        System.out.print("Enter marks for Student 2 (0-100): ");
        int mark2 = scanner.nextInt();
        System.out.print("Enter marks for Student 3 (0-100): ");
        int mark3 = scanner.nextInt();
        int passCount = 0;
        if (mark1 >= 35) {
            passCount++;
        }
        
        if (mark2 >= 35) {
            passCount++;
        }
        
        if (mark3 >= 35) {
            passCount++;
        }
        System.out.println("Number of students who passed: " + passCount);
        scanner.close();
    }
}
	
	


