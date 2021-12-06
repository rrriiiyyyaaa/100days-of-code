//coping elements of an array to another:

public class Main
{
	public static void main(String[] args) {
	    int[] original = {10,20,30,40,50};
	    int[] copy = original;
	    System.out.println("Original array is: ");
	    for (int i=0;i<original.length ;i++)
	    {
	        System.out.print(original[i] + " ");
	    }
	    System.out.println();
	    System.out.println("Copied array: ");
	    for (int i=0; i< copy.length ;i++)
	    {
	        System.out.print(copy[i] + " ");
	    }
	    
  }
}