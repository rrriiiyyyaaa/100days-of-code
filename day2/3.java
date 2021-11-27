
// to print date taking user input.

import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the date: ");
            int date = sc.nextInt();
            System.out.print("Enter the month: ");
            int month = sc.nextInt();
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            System.out.println( "The date is "+date+ "-"+ month + "-"+ year);
            
          }
}
