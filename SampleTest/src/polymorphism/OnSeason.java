package polymorphism;

public class OnSeason extends OffSeason 
{
    @Override
    
	public void discount()
	{
		    super.discount();
			discount = total*0.4;
			finalamount = total - discount;
			System.out.println("Final Amount is: " +finalamount);
	}
	public static void main(String[] args) {
		
     OnSeason obj2 = new OnSeason();
     obj2.discount();
	}

}
