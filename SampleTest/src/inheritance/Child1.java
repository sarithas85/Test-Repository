package inheritance;

public class Child1 extends Parent1 {
	int c;
	
	public void sum()
	{
		c=a+b;
		System.out.println("sum is:" +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child1 obj1=new Child1();
obj1.sum();
	}

}
