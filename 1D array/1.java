



/*
  Here user can enter as much elements as he can:
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many  elements you want to enter: ");
		int abcnum = sc.nextInt();
		System.out.println("You want to enter: "+ abcnum +  " elements. ");
		int num[] = new int[abcnum];
		
		for (int i=0;i<num.length ;i++ )
		{
		    System.out.println("Enter "+ abcnum + " elements:");
		    num[i] = sc.nextInt();
		}
                     //displaying the values
		for (int i=0;i<num.length ;i++ ) 
		{
		    System.out.println("The value of ["+i+"] is "+ num[i]);
		}
	}
}
