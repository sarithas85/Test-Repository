package encapsulation1;

public class Bank 
{
  private int pin;
  
  public void setter(int pin)
  {
	  this.pin = pin;
  }
  
  public void validategetter()
  {
	  if (pin == 1001 || pin == 1234 || pin == 1212 )
	  {
		 System.out.println("Valid Pin:Amount can be withdrawn");
	  }
	  else
	  {
		  System.out.println("Invalid Pin");
	  }
  }
}
