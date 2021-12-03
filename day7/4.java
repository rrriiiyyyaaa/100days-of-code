/*
  prime factors of a number
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int n = sc.nextInt();                          //24
	    int temp =n;                                      //temp =24
	    int i =2;
	    while(temp >1)                                   //24>1                    12>1                 6>1                                        3>1              1>1 (false)    3>1 (true)      1>1(false)
	    {
	        if(temp%i ==0)                                //24%2 =0 -> true       12%2 =0  ->true        6%2 =0 ->true                                3%2 =0 ->true                 3%3 = 0 -> (true)
	        {
	            System.out.print(i + " ");                   //2(prints)              2(prints)                   2(prints)                          2 (prints)                     3(prints)
	            temp = temp/i;                             // temp = 24/2 (loop continues)      temp = 12/2(loop continues)      temp = 6/2 (loop continues)          temp =3/2       temp = 3/2 =1
	        }
	        else 
	        {
	            i++;                                       //i=3                      i=4  (loop terminates as 1%2 !=0 )
	        }
	    }
	    
	}
}
