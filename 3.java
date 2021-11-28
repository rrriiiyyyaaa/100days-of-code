/*
   A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter years of service:");
		int year = sc.nextInt();
		 System.out.println("Enter your salary: ");
		int salary = sc.nextInt();
		
		if(year>5)
		{
		    double bonus = ( (0.05)*salary);
		    System.out.println("You get a bonus of "+ bonus+ ".As your year of service is "+ year);
		    double bs = (salary + bonus);
		     System.out.print("So, your salary is "+ bs);
		    
		}
		else
		{
		     System.out.println("You didn't get bonus as your year of service is "+ year + "So, your salary is "+ salary);
		}
	}
}
