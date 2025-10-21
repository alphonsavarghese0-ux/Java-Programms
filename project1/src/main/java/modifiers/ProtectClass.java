package modifiers;

public class ProtectClass {
	protected void display()
	{
		System.out.println("Example of protected class");
	}

	public static void main(String[] args) {
   ProtectClass c= new ProtectClass();
   c.display();
	}

}
