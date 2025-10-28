package encapsulation;

public class Encap2 {

	public static void main(String[] args) {
		Encap c= new Encap();
		c.setmethod(5, "Encapsulation method");
		System.out.println(c.getmethod());// Should call inside the printing statement since we are using return type//
		System.out.println(c.getmethod2());
		

	}

}
