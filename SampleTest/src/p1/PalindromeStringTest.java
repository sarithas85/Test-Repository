package p1;

public class PalindromeStringTest {
	
	public void findpalindrome()
	{
		String s="Malayalam";
		String reverse="";
		String low=s.toLowerCase();
		System.out.println(s.length());
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
	       reverse = reverse + low.charAt(i);
		}
		
		
		System.out.println(reverse);
		
		if(low.equals(reverse)) 
		
			System.out.println("Its a Palindrome String");
		else
		
			System.out.println("Not a Palindrome String");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PalindromeStringTest p=new PalindromeStringTest();
       p.findpalindrome();
      
	}
	

}
