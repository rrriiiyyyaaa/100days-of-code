// printing 2D array-

import java.util.Scanner;


public class Main {

   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int rows = sc.nextInt();

       int cols = sc.nextInt();

        //input size
       int[][] num = new int[rows][cols];


       //rows

       for(int i=0; i<rows; i++) {

           //columns

           for(int j=0; j<cols; j++) {

               num[i][j] = sc.nextInt();

           }

       }


        //output-
       for(int i=0; i<rows; i++) {

           for(int j=0; j<cols; j++) {

                   System.out.print(num[i][j]+" ");

               }

               System.out.println();

           }

   }

}