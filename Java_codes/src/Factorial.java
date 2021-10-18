import java.util.*;

public class Factorial {
public static int fact(int n) {
	if(n==0||n==1)
		return 1;
	return n*fact(n-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
System.out.println("Factorial of "+n+" is " + fact(n));

		
	}

}
