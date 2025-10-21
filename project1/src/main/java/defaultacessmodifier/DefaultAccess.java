package defaultacessmodifier;

public class DefaultAccess {
	void display()
	{
		System.out.println("Default access modifier");
	}

	public static void main(String[] args) {
		
      DefaultAccess d = new DefaultAccess();
      d.display();
	}

}
