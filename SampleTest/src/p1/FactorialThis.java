package p1;

public class FactorialThis {
	
	int fact=1;
	int num;

	public void calculatefactorial(int a)
	{
		num=a;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
	}

	public void printresult()
	{
		this.calculatefactorial(5);
		System.out.println("Factorial of " + num + " is " +fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialThis obj1 = new FactorialThis();
		obj1.printresult();
	}

}
