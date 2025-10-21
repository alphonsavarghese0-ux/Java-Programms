package superprogramm;

public class SuperChild extends SuperParent { // inherit child with parent //
	int a=67; // same variable is given to child //
	public void maths() // A method create //
	{
		System.out.println(a); // printing child // 
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		SuperChild s= new SuperChild();
		s.maths();

	}

}
