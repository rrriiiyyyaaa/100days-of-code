/*
  Find the product of digits of a number.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		 int temp = n;
		 int product = 1;
		while(temp !=0)
	    {	
	      
		     product = product*(temp%10);
		     temp = temp/10;
	    }
	System.out.println("The product of these digits is "+product);
	}
	
}
