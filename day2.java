/*
Take values of length and breadth from use and check if it is a square or rectangle.
*/

import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int length = sc.nextInt();
        System.out.print("Enter the breadth:");
        int breadth = sc.nextInt();
        if(length == breadth)
          {
              System.out.print("This is a square");
          }
        else
          {
              System.out.print("This is a rectangle");
          }
    }
}


/*

Output-
  length: 5
  breadth: 5
  This is a square
*/
/*
Output-
  length: 5
  breadth: 7
  This is a rectangle
*/
  