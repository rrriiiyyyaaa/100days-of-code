using string concatenation:
public class Main
{
	public static void main(String[] args) {
		String s = "abc";
		String rev = "";
		int length = s.length();             //3
		for ( int i =length-1;i>=0;i-- )          //2 -> 1  -> 0
		{
		    rev = rev + s.charAt(i);               //c  -> b ->a = cba
		}
		System.out.println("Reverse string is: " + rev);
	}
}

Using character array:
public class Main
{
	public static void main(String[] args) {
		String s = "abc";
		char a[] = s.toCharArray();
		String rev = "";
		int length = s.length();             //3
		for ( int i =length-1;i>=0;i-- )          //2 -> 1  -> 0
		{
		    rev = rev + a[i];               //c  -> b ->a = cba
		}
		System.out.println("Reverse string is: " + rev);
	}
}

Using string buffer:
public class Main
{
	public static void main(String[] args) {
	    String str = "abc";
	    StringBuffer sb = new StringBuffer(str);
	    System.out.println(sb.reverse());
	}
}
