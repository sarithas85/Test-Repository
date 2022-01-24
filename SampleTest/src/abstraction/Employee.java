package abstraction;

public abstract class Employee {
	
	public abstract void calculatesalary();
	
	double sal;
	
		public void calculate(double payperhour, double hoursworked)
		{
			sal = payperhour * hoursworked;
			System.out.println(sal);
		}
		
		
	}


