 check palindrome no.


import java.util.Scanner;
public class Main
{
	public static void main(String args[]){  
    int num, rev = 0, remainder;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    num = sc.nextInt();
   
    int orig = num;
    
   
    while (num != 0) {
      remainder = num % 10;
      rev = rev * 10 + remainder;
      num = num/10;
    }
    
    
    if (orig == rev) {
      System.out.println(orig + " is Palindrome.");
    }
    else {
      System.out.println(orig + " is not Palindrome.");
    }
  }  
} 

