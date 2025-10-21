package inheritancepgm;

public class SingleChild extends SingleClassA {
	public void create() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		SingleChild s= new SingleChild();
		s.create();
		s.display();

	}

}
