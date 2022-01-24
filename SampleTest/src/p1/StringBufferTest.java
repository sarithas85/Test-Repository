package p1;

public class StringBufferTest 
{
	public void display()
	{
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		sb.insert(2,"test");
		System.out.println(sb);
		sb.replace(2, 6, "hai");
		System.out.println(sb);
		sb.delete(2, 5);
		System.out.println(sb);
		sb.append(" welcome");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       StringBufferTest obj=new StringBufferTest();
       obj.display();
	}

}
