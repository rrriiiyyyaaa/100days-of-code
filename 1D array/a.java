/*
  Array for printing sum:
*/


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the elements you want to enter: ");
	    int n = sc.nextInt();
	    int a[] = new int [n];
	    
	    //array for inputing values from user:
	    System.out.println("Enter the elements whose sum is to be calculated: ");
	    for (int i=0;i<a.length ;i++ ){ 
		    a[i] = sc.nextInt();
	    }
	    //array for printing elements:
	    	System.out.println("Elements are : ");
	        for (int i=0;i<a.length ;i++ ){ 
	        System.out.println(a[i]);
	    }
	    //for calculating sum:
	    int sum =0;
	     for (int i=0;i<a.length ;i++ ){ 
	         sum = sum + a[i];
	     }
	System.out.println("Sum is: "+ sum);
  }
}