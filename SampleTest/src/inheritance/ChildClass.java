package inheritance;

public class ChildClass extends ParentClass 
{
	public void  display()
	{
		System.out.println("child class");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChildClass obj=new ChildClass();
     obj.test();
     obj.display();
	}

}
