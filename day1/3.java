/*
   Using for loop
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        long factorial = 1;
        
        for(int i = 1; i <= num; ++i)
        {
     
            factorial *= i;
        }
        System.out.printf("Factorial of "+num+ "is "+ factorial);
    }
}
/*
Output
*/
//Using recursion:
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " is " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}

/*
   Output-
Enter the number: 7
Factorial of 7 is 5040
