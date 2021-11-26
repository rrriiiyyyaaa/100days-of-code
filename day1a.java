/*
   Take 10 integers from keyboard using loop and print their sum value on the screen.
*/

import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.print("Enter 10 numbers: ");
        for(int i=0;i<10;i++)
        {
            
            sum = sum + sc.nextInt();
            
        }
        System.out.print("The sum of these numbers are"+sum);
    } 
}

/*
  Output-
Enter 10 numbers:1
2
3
4
5
6
7
8
9
10
The sum of these numbers are 55

*/
