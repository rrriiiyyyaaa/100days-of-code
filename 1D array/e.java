// merged array:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    //asking to how many elements user wants to enter in arrat A:
	    System.out.println("Enter the number of elements you want to enter in array A: ");   //3
	    int n1 = sc.nextInt();
	    int A[] = new int[n1];
	    //asking to how many elements user wants to enter in arrat B:
	    System.out.println("Enter the number of elements you want to enter in array B: ");       //3
	    int n2 = sc.nextInt();
	    int B[] = new int[n1];
	    //array C for storing the merged array-
	    int n3 = n1+n2;  //n3 is length of array C
	    int C[] =new int[n3];
	    System.out.println("Enter n1 elements for array A: ");              //1 2 3 
	    for (int i=0;i< A.length ;i++)
	    {
	        A[i] = sc.nextInt();
	    }
	     System.out.println("Enter n2 elements for array B: ");             //4 5 6 
	    for (int i=0;i<B.length ;i++ )
	    {
	        B[i] = sc.nextInt();
	    }
	    
	    //coping first array elements:
	    for (int i =0;i<n1 ;i++)
	    {
	        C[i] = A[i];                                                 //at C[0] = 1,C[1]=2.C[2] = 3
	        
	    }
	    //coping second array elements in C[n1+i] positions:
	    for (int i =0;i<n2 ;i++)
	    {
	        C[n1+i] = B[i];                                             //at C[3+0]=4,C[3+1]= 5, C[3+2]= 6
	        
	    }
	    //printing merged array:
	     System.out.println("Hence, the merged array is: ");
	    for (int i=0;i<C.length ;i++){ 
	        
	        System.out.print(C[i]+ " ");                                 // 1 2 3 4 5 6 
	    }
  }
}