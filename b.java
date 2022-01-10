public class Main
{
   
	public static void main(String[] args)
	{
		String str = "How To Do In Java ";

		String reverseString = reverseString(str);

		System.out.println(reverseString);
	}

	public static String reverseString(String str)
	{
		//base class
		if (str.isEmpty())
		{
		     return str;
		}

		//Calling function recursively
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
