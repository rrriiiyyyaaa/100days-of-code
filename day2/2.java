/*
Write a program to check wether the character entered is uppercase or lowercase.
*/


import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);
        if(ch >='A' && ch <= 'Z')
        {
            System.out.print(ch + " is an upper class letter.");
        }
        else if (ch >= 'a' && ch <= 'z')
        {
            System.out.print(ch + " is a lower case letter.");
        }
        else{
            System.out.print(ch + "is not an alphabet.");
        }
    }
}

/*
  Output-
Enter the character:
k
k is a lower case letter.
*/
