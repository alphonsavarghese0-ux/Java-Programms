package aggregation;

public class AggregateChild {
	int x,y;
	AggregateParent c;
	public AggregateChild(int x,int y,AggregateParent c)
	{
		this.x=x;
		this.y=y;
		this.c=c;
	}
	public void show()
	{
		System.out.println(x);
		System.out.println(y);
		c.display();
	}

	public static void main(String[] args) {
      AggregateParent p= new AggregateParent(23,34);
      AggregateChild n= new AggregateChild(45,67,p);
      n.show();
	}

}
