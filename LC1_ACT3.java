//LC 1 ACTIVITY 3 NEGATIVE AND NON NEGATIVE NUMBER PROGRAM
import java.util.Scanner;
public class LC1_ACT3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int PositiveCount=0;
		int NegativeCount=0;
		System.out.println("GRACESON NATHANAEL J URK23CS1068");
		System.out.println("Enter 5 Numbers:");
		for(int i=0;i<=5;i++) {
			System.out.print("Enter number " + i + ": ");
            int n = sc.nextInt();
			if(n<0) {
				NegativeCount++;
			}
			else {
				PositiveCount++;
			}
		}
		System.out.println("Total Negative numbers: " + NegativeCount);
        System.out.println("Total Non-Negative numbers (including 0): " + PositiveCount);
        sc.close();
	}

}
