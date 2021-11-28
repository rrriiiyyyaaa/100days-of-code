/*
  Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1
*/


public class Main {
  public static void main( String args[] ) {
    
    int x = 1;
    int y = -1;
    
    //to retrieve the absolute value in Java, we use the abs() function.

    System.out.println( "Absolute Value of x: " + Math.abs(x) );
    System.out.printf( "Absolute Value of y: "+ Math.abs(y) );

    
  }
}