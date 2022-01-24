package abstraction;

public class Salary extends Employee {
	
	int sal1=8000;
	
	public void calculatesalary()
	{
		
		sal1 = sal1 * 8;
		System.out.println(sal1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Salary obj = new Salary();
       obj.calculate(5000, 10);
       obj.calculatesalary();
	}

}
