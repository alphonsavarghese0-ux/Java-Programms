package exception;

public class exceptionExample {

	public static void main(String[] args) {
		try
		{
		int a=15;
		int div = a/0;
		
		System.out.println(div);
	}
		/* catch (ArithmeticException e) // handles exeception
		{
			System.out.println(e);
		} */
		//
		finally
		{
			System.out.println("finally block");
		}
	}
}


