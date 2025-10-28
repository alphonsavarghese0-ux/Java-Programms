package polymorphism;

public class Child extends Parent {
	public void show()
	{
		System.out.println("inheritance");
	
	}

	public static void main(String[] args) {
		Child c= new Child();
		c.show();
		Parent p= new Child(); // upcasting//
		p.show();
		
		

	}

}
