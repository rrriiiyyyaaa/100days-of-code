/*
  hcf of two numbers
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hcf=0;
		System.out.println("Enter 1st no.: ");              //declare two variables  a and b
		int a = sc.nextInt();
		System.out.println("Enter 2nd no.: ");
		int b = sc.nextInt();
		
		for (int i=1; i<=a && i<=b ;i++ )                       //set loop from 1 to max of a and b
		{                                          
		    if(a%i==0 && b%i ==0)                               //check if both are completely divided by the same loop
		    hcf =i;                                             //of yes, display the stored number in haf
		}
		System.out.println("HCF of two numbers is: "+ hcf);           // print hcf
	}
}
