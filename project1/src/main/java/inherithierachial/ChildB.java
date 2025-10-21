package inherithierachial;

public class ChildB extends Parentclass{
	public void show()
	{
		System.out.println("Child class B");
	}
public static void main (String args[])
{
	ChildB b= new ChildB();
	b.show();
	b.display();	
}
}
