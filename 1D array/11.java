import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a[] = new int[3];
	    Scanner sc = new Scanner(System.in);
	    /*
	    System.out.println("Elements you want to enter: ");
	    
	    int a[] = new int[3];
	    for (i=0;i<3 ;i++ )
		{
		    System.out.println("Enter array element ["+ i +"]");
		    a[i] = sc.nextInt();
		}
		*/
		//printing original values:
		System.out.println("Enter 1st array elements: ");
		for (int i=0;i<a.length ;i++ )
		{
		    
		   
		     a[i] = sc.nextInt();
		    
		}
		System.out.print("Original array is: ");
		for (int i=0;i<a.length ;i++ )
		{
		        System.out.print(a[i] + " ");
		
		}
		
		//printing reverse array values:
		int j=0;
		int b[] = new int[3];
		for (int i=b.length-1; i >= 0 ;i-- )
		{
		    b[i] = a[j];
		    j++;
		}
		System.out.print("Reverse array of a[i] is b[i] is  :");
		for (int i=0; i <= b.length ;i++ )
		{
		
		System.out.print(b[i]);
		}
	}	
}
	    
