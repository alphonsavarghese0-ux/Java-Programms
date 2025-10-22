package polymorphism;

public class Poly {
	public void display()
	{
		System.out.println("This is an example of polymorphism");
	}
	public void display(int a)
	{
		System.out.println(a);
		
	}
	public void display (String name)
	{
		System.out.println("Java");
	}
	
	public static void main(String[] args) {
		Poly p= new Poly();
		p.display();
		p.display(7);
		p.display("name");

	}

}
