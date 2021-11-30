/*
   reverse of number
*/

//Using algorithm
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number whose reverse is to be found: ");
	     int num = sc.nextInt();   //1234
	    int rem =0,rev=0;
	    while(num != 0)                //1234>0                                       
	    {    
	        rem = num%10;                    //123%10= 4 
	        rev = (rev*10) +rem;               //(0*10)+ 4=4                               
	                               
	        num = num/10;                //1234= 1234/10=123  (loop continues)          
	    }
	    
	    
		System.out.println("The reverse of this number is "+rev);                 
	}
}

// Using String Buffer

public class Main
{
	public static void main(String[] args) {
	    StringBuffer sb = new StringBuffer("1334");  
        System.out.println("string: " + sb);  
        // reversing of stringbuffer  
        System.out.println("reverse: " + sb.reverse());  
	}
}
