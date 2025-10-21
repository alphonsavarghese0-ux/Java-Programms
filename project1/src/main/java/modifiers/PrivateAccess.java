package modifiers;

public class PrivateAccess {
	private void tell()
	{
		System.out.println("Example of private access modifier");
	}

	public static void main(String[] args) {
		PrivateAccess p = new PrivateAccess();
		p.tell();
		
	}

}
