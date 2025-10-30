package abstraction;

public class InterfaceClass implements Interface {
	public void method2()
	{
		System.out.println("Example of Interface");
	}
 
	public static void main(String[] args) {
		
      InterfaceClass s = new InterfaceClass();
      s.method2();
	}

}
