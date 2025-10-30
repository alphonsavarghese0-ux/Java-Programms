package assignment5;

public class Palindrome {

	public static void main(String[] args) {
		String s1= "Java";
		String s2="avaj";
		String s3 = "Malayalam";
		String s4 = "Malayalam";
		if (s1.equalsIgnoreCase(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		if (s3.equalsIgnoreCase(s4))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		
	}

}
