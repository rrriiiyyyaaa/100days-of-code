// Java Program to find Power of a Number
import java.util.Scanner;

public class Main  {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int num, i, exponent;
		long power = 1;
		sc = new Scanner(System.in);
		
		System.out.print(" Enter the Number : ");
		num = sc.nextInt();	
		
		System.out.print(" Enter the Exponent Value : ");
		exponent = sc.nextInt();	
		
		for(i = 1; i <= exponent; i++)
		{
			power = power * num;
		}
		System.out.println("The Final result of " + num + " power " + exponent + " = " + power);
	}
}

