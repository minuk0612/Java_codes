import java.util.*;

public class CountOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
			
		}
System.out.println("Total number of Digit present: "+count);
	}

}
