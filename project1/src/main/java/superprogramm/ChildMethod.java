package superprogramm;

public class ChildMethod extends ParentMethod {
	public void display() // Method over ridding //
	{
		System.out.println("This is child method");
	}
	public void tell()
	
	{
		display();
		super.display();
	}

	public static void main(String[] args) {
		ChildMethod m= new ChildMethod();
		m.tell();

	}

}
