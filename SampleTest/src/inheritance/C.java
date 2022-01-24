package inheritance;

public class C extends B
{
  public void display()
  {
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj= new C();
obj.print();
obj.display();
	}

}
