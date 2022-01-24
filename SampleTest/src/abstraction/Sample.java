package abstraction;

public class Sample extends Check {
	
	public void display()
	{
		System.out.println("Abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sample obj = new Sample();
     obj.show();
     obj.display();
	}

}
