import java.util.Scanner;

public class pallindrome {
public static boolean Ispallin(int n) {
	int a=n;
	int b=0;
	while(a>0) {
		b=b*10+(a%10);
		a=a/10;
	}
	if(b==n)
		return true;
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(Ispallin(n)) {
			System.out.println("The given number is pallindrome");
		}
		else
			System.out.println("Not a pallindrome");

	}

}
