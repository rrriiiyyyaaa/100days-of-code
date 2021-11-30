import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		
		System.out.println(" The natural numbers from"+ n + "to 1 are:");
		for (int i=n;i>=1 ;i-- )
		{
		    System.out.print(i + " ");
		}
	}
}
