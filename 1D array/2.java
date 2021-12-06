


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pos =0;
		int neg =0;
		int zero =0;
		int odd =0;
		int even =0;
		System.out.println("Enter how many  elements you want to enter: ");
		int num = sc.nextInt();
		int check[] = new int[num];
		
		    System.out.print("Print "+ num+ " elements: ");
		
		
		for (int i=0;i<check.length ;i++ ) {
		    check[i] = sc.nextInt();
		}
		for (int i=0;i<check.length ;i++ ){
		
		    if (check[i] > 0)
		    {
		        pos++;
		    }
		    else if(check[i] < 0)
		    {
		        neg++;
		    }
		    else
		    {
		        zero++;
		    }
		    if (check[i]%2 == 0) 
		    {
		        even++;
		    }
		    else  
		    {
		        odd++;
		    }
		   
		}
		 System.out.println("Positive:"+ pos + " ,Negative:"+ neg+ " ,Zero:"+ zero + " ,Even:"+ even+ " ,Odd:"+ odd );
	}
}



public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
	    
	    //inserting n elements:
	    if (int i=0;i<arr.length;i++) {
	        arr[i] = sc.nextInt();
	    }
	System.out.print("Enter the element to be searched.");
	Scanner sc = new Scanner(System.in);
	int same = sc.nextInt();
	
	
	int count =0;
	for(int i=0;i<=arr.length;i++)
	{
	
	    if (arr[i] == n)
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

