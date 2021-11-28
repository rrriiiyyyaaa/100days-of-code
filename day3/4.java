/*
   A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = sc.nextInt();
		
		if(marks<25)
		{
		    System.out.print("F");
		    
		}
		else if((marks>=25) && (marks<=45))
		{
		    System.out.print("E");
		   
		}
		else if((marks>=46) && (marks<=50))
		{
		    System.out.print("D");
		    
		}
		else if((marks>=51) && (marks<=60))
		{
		    System.out.print("C");
		    
		}
		else if((marks>=60) && (marks<=80))
		{
		    System.out.print("B");
		    
		}
		else
		{
		    System.out.print("A");
		    
		}
		
	}
}
