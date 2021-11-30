/*
  Sum of first and last digit:
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int fd,ld;
		int fdsum =0;
		ld = n%10;
		System.out.println("The last digit is: "+ld);
		fd = n;
		while(fd >=10)    //789
		{
		    fd = fd/10;     //789/10=78
		    
		}
		
		 System.out.println("The first digit is: "+fd);
		 System.out.print(" Hence the sum of first and last digit is "+ (fd+ld));
	}
}
