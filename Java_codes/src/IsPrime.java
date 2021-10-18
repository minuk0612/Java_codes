import java.util.Scanner;

public class IsPrime {

	public static boolean isprime(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");

		int a=sc.nextInt();
		if(isprime(a)) {
			System.out.println("The given number is prime");
			
		}
		else
			System.out.println("The given number is not a prime");
		
	}
}
