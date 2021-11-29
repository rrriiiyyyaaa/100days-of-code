/*
   Check if the year entered is leap year or not.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the year: ");
	    // Take integer variable year and assign a value to it.
	    int year = sc.nextInt();
	    
	    // 1. century- if it is divisibe by 100 and 400 both, it is a leap year (century).  Ex- 2000 and 2400 are leap year because both conditions are true.
	    //             But, 1700 and 1800 are also divisible by 100 but not by 400.Hence, they are not leap year.
	    //Algo1- Check the year is divisible by 100 and 400.
	    
	    //2. yearly-  Check not divisibe by 100 and divisible by 4.
	    //Algo2- Check if the year is  not divisibe by 100 and divisible by 4.
	    if((year%100 ==0) && (year%400 ==0)|| (year%100 != 0)&& (year%4==0))
	    {
	        System.out.println("leap year");
	    }
	    else
	    {
	        System.out.println("not leap year");
	        
	    }
	}
}
