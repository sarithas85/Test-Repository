package inheritance;

public class TotalSalary extends SalaryDetails
{
   int totalsal;
   
   public void calculatetotal()
   {
	   calculate();
	   totalsal=(int)(basicpay+hra-pf-deduction+bonus);
   }
   
   public void getsalslip()
   {
	   System.out.println("Salary Slip of Employee: ");
	   System.out.println(" ");
	   System.out.println("Basic Pay: " +basicpay);
	   System.out.println("Deduction: " +deduction);
	   System.out.println("HRA: " +hra);
	   System.out.println("PF: " +pf);
	   System.out.println("Bonus: " +bonus);
	   System.out.println("Total Salary by hand: " +totalsal);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TotalSalary ts=new TotalSalary();
     ts.calculatetotal();
     ts.getsalslip();
	}

}
