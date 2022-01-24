package p1;

public class StringPgm 
{
   public void strmethods()
   {
     String s="welcome";
     String s2="welcome";
     String s3="Welcome";
     String s4="test";
     String s5="";
     String s6="Hello"+"World";
     int a=50;
     String s1=String.valueOf(a);
     System.out.println(s.length());
     System.out.println(s.charAt(5));
     System.out.println(s1);
     System.out.println(s.equals(s2));
     System.out.println(s2.equals(s3));
     System.out.println(s3.equals(s4));
     boolean b=s2.equalsIgnoreCase(s3);
     System.out.println(b);
     System.out.println(s5.isEmpty());
     System.out.println(s6);
   }
   
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      StringPgm str=new StringPgm();
      str.strmethods();
	}

}
