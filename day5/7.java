/*
   reverse of number
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number whose reverse is to be found: ");
	    int num = sc.nextInt();   //123
	    int rem =0,rev=0;
	    while(num > 0)                //123>0                                       
	    {                                                                        
	        rev = num%10;           //123%10=3                                     
	                               
	        num = num/10;                //123= 123/10=12  (loop continues)          
	    }
	    
		System.out.println("The reverse of this number is "+rev);                 
	}
}