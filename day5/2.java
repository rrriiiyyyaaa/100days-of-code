import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();                              //7
		while(n>0)                                          // 7>0 -true (enters loop)
		{
		    System.out.print(n + " ");                        //7
		                                                         
		    n--;                                                  //7-1 = 6(continue loop)
		}
		
	}
}
