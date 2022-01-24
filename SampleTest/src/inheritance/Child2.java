package inheritance;

public class Child2 extends Parent1
{
	int d;
	
public void diff()
{
	d=a-b;
	System.out.println("Difference is:" +d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Child2 obj2=new Child2();
 obj2.diff();
 Child1 obj3=new Child1();
 obj3.sum();
	}

}
