import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int fd,ld;
		ld = n%10;
		System.out.println("The last digit is: "+ld);
		fd = n;
		while(fd >=10)    //789
		{
		    fd = fd/10;     //789/10=78
		   
		}
		
		 System.out.println("The first digit is: "+fd);
	}
}
