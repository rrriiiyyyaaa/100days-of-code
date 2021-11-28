
/*
Take input from user and print the greatest amongst two.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    System.out.print("Enter 1st number: ");
	    Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    System.out.print("Enter 2nd number: ");
	    int n2 = sc.nextInt();
	        if(n1 > n2)
	        {
	            System.out.println(n1 + " is greater than "+ n2);
	        }
	        else
	        {
	            System.out.print(n2+ " is greater than "+ n1);
	        }
		
	}
}
/*
A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Judge and print total cost for user.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter quantity: " );
	    double price = sc.nextFloat();
	    if((price*100) > 1000)
	    {
	        double dp = ((0.1)*price);
	        double pad = (price - dp);
	        System.out.print("You get a discount of 10% i.e., "+ dp+ ". So, your total cost is"+ pad);
	    }
	    else
	    {
	        System.out.print("No discount. So your total cost is "+ price);
	    }
	    
		
	}
}

