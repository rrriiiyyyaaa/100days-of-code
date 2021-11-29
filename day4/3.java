/*
  to Print Natural Numbers from 1 to n
*/


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		
		System.out.println(" The "+ n + " natural numbers are:");
		for (int i=1;i<=n ;i++ )
		{
		    System.out.print(i + " ");
		}
	}
}
