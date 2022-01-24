package inheritance;

public class B extends A {
	int c;

	public void print()
	{
		c=a+b;
		System.out.println("sum is:" +c);
	}
	
public static void main(String args[])
{
	B obj1=new B();
	obj1.print();
}
}


