package inheritance;

public class SalaryDetails extends EmpSalary
{
	double hra;
	double pf;
	
	public void calculate()
	{
		hra=basicpay*0.05;
		pf=basicpay*0.2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryDetails SD=new SalaryDetails();
		SD.calculate();
	}

}
