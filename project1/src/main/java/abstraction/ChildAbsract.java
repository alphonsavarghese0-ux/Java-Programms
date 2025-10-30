package abstraction;

public class ChildAbsract extends ParentAbsract{
	public void method1()
	{
		System.out.println("inheriting from parent class");
	}

	public static void main(String[] args) {
		
         ChildAbsract m= new ChildAbsract();
         m.method1();
         m.show();
	}

}
