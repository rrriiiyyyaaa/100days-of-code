//sum of digits of a number:

import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in); 
	     System.out.println("Enter the number whose sum of digits is to found");
	     int num = sc.nextInt();
	     int rem=0,sum =0;
	     while (num > 0)
	     {
	         rem = num %10;
	         sum = sum + rem;
	         num = num / 10;
	     }
	     System.out.println("The sum of digits is :"+sum);
	}
}


/*
Output-
   Enter the number whose sum of digits is to found
   12345678
   The sum of digits is: 36