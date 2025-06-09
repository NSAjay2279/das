import java.util.Scanner;

public class Fibonacci {
	static int F(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return F(n-1) + F(n-2);	
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Enter value of n: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(F(n));
	}
}