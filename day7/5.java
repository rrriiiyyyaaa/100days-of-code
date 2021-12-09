/*
  Check if it is a armstrong no or not
*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int temp, r, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number: ");
        int number = sc.nextInt();
         temp = number;

        while (temp != 0)
        {
            r = temp % 10;
            
            sum += Math.pow(r, 3);
            temp =temp/10;
        }
        if(sum == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
