/*
   to find the first and last digit of a number
*/

public class Main{
    public static void main(String[] args)
    {
        //declare variables
        int num,firstdigit,lastdigit;
        
        //Giving number as the user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = sc.nextInt();
        
        //find the firstdigit
        firstdigit = num;
        while(firstdigit>=10)
        {
            firstdigit = firstdigit / 10;
        }
        //find the lastdigit
        lastdigit = num % 10;
        
        //printing the first and last digit
        System.out.println("\n The First Digit of a Given Number " + num + "  =  " + firstdigit);
		System.out.println("\n The Last Digit of a Given Number " + num + "  =  " + lastdigit);
    }
}
