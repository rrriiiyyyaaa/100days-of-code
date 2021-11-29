/*
  Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".
*/


import java.util.*;

public class Main{

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter sex: M/F");
		int sex = sc.next().charAt(0);
		
		// checking if user is female
		if(sex == 'F') {
			System.out.println("You will work in urban areas");
		}
		
		// checking if user is male
		if(sex == 'M') {
		    
		System.out.println("Enter your age");
		int age = sc.nextInt();
		    
			if((age >= 20) && (age < 40)) {
				System.out.println("You may work anywhere");
			}
			else if((age >= 40) && (age < 60)) {
				System.out.println("You will work only in urban areas");
			}
			
			else {
				System.out.println("ERROR");
			}
		}
	}
}
