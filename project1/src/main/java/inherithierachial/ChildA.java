package inherithierachial;

public class ChildA extends Parentclass {
	public void create() {
		
		System.out.println("Child class A");
	}
public static void main (String args[]) {
	ChildA a= new ChildA();
	a.create();
	a.display();
}
}

