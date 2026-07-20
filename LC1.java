//LC 1 ACTIVITY 1 SWAPPING OF NUMBERS PROGRAM
public class LC1 {
	public static void main(String [] args) {
		int a=10;
		int b=20;
		int c=30;
		System.out.println("GRACESON NATHANAEL J URK23CS1068");
		System.out.println( "Initial Swap:  a = " + a + ", b = " + b + ", c = " + c);
		int temp=a;
		a=c;
		b=c;
		c=b;
		b=temp;
		System.out.println( "Final Swap:  a = " + a + ", b = " + b + ", c = " + c);
	}

}
