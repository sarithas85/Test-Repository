package interface1;

public class HDFC implements RBI 
{
   float d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HDFC obj=new HDFC();
     obj.recurringdeposit(2000,5);
     
	}
	@Override
	public void recurringdeposit(float amount, int duration) {
		// TODO Auto-generated method stub
		d=amount*duration*interestrate;
    	System.out.println("Deposited amount:" +d);
	}

}
