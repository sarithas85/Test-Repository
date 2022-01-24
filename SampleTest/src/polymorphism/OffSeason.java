package polymorphism;

public class OffSeason 
{
	double total=5000;
	double discount;
	double finalamount;


public void discount()
{
	
		discount = total*0.15;
		finalamount = total - discount;
		System.out.println("Final Amount is: " +finalamount);
	
}
}