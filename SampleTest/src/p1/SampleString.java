package p1;

public class SampleString {
public void string()
{
	String s="test";
	String s2="test";
	String s3="Test";
	String s4="Hello";
	String s5="";
	int b=30;
	System.out.println(s.length());
	System.out.println(s.charAt(1));
	String s1=String.valueOf(b);
	System.out.println(s1);
	System.out.println(s.equals(s2));
	System.out.println(s3.equals(s2));
	System.out.println(s4.equals(s3));
	boolean f=s.equalsIgnoreCase(s3);
	System.out.println(f);
	System.out.println(s5.isEmpty());
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SampleString obj=new SampleString();
obj.string();
	}

}
