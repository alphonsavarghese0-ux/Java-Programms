package multipleinheritance;

public class InterfaceChildClass implements ParentInterface1,ParentInterface2{
	public void show()
	{
		System.out.println("inheriting Interface1`");
	}
			
	public void display()
	{
		System.out.println("Inheriting interface2");
	}

	public static void main(String[] args) {
		InterfaceChildClass a= new InterfaceChildClass();
		a.show();
		a.display();
	 

	}

}
