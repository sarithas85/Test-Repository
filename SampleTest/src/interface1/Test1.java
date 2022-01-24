package interface1;

public class Test1 implements print
{
	public void show()
	{
		System.out.println("Hello");
		System.out.println(a);
	}
	
	public void display()
	{
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test1 obj = new Test1();
       obj.show();
       obj.display();
	}

}
