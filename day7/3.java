// program to check if it is prime no.

import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();                          //7
	    int count = 0;
	    
	    if (n >1)                                       //7>1 -> true(enters in loop)
	    {
	        for (int i=1;i<=n ;i++ )                       
	        {
	            if(n%i == 0)                            //7%1=0 -> true         7%2=0 ->true 
	            count++;                                // count=1              count =2
	        }
	        if (count == 2)                                                    //true
	        { 
	            System.out.println(n + " is prime no.");                       //true (print)
	        }
	        
	    }
	    else
	        {
	            System.out.println(n + " is not  a prime no.");
	        }
	    
	}
}
