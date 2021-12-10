/*
Algorithm-
1.Traverse the array.
2.match the key element with the answer element.
3.when the element is found return its index.
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int arr[] = {1,2,3,4,5,6};
	    System.out.println("enter the element you want to be searched. ");
	    int key = sc.nextInt();
	    for (int i=0;i< arr.length ;i++ )
	   {
    	    if(arr[i] == key)
    	    {
    	        System.out.println(key + " is present at index "+ arr[i]);
    	       break;
    	    }
	   }
   	}
}