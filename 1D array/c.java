/*
  average:
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
	    System.out.println("Enter the elements whose average is to be calculated: ");
	    for (int i=0;i<a.length ;i++ ){ 
		    a[i] = sc.nextInt();
	    }
	    //array for printing elements:
	    	System.out.println("Elements are : ");
	        for (int i=0;i<a.length ;i++ ){ 
	        System.out.println(a[i]);
	    }
	    //for calculating product:
	   int sum =0,avg =1;
	     for (int i=0;i<a.length ;i++ ){ 
	         sum = sum + a[i];
	     }
	System.out.println("Average is: "+ sum/a.length);
  }
}