import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
	    System.out.println("Enter elements: ");
	    //inserting n elements:
	    for (int i=0;i<arr.length;i++) {
	        arr[i] = sc.nextInt();
	    }
	System.out.print("Enter the element to be searched.");
	
	int same = sc.nextInt();
	
	
	int count =0;
	
	for(int i=0;i<arr.length;i++)
	{
	
	    if (arr[i] == same)
	    {
		    count++;
	    }
	}
	if(count>0)
	
	System.out.println("Element found.");

	else
	System.out.println("Element not found. ");
	
	    
		
	}
}

