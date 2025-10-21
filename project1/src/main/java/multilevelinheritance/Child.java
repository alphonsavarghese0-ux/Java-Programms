package multilevelinheritance;

public class Child extends Intermediateparent{
	public void Subtract()
	{
		int a=34;
		int b=56;
		int result = a-b;
		System.out.println("Result :"+result);
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.Subtract();
		obj.add();
		obj.display();

	}

}
