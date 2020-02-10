package topic4Exercises;


public class JFT4Ex3{
	
	public static void main(String[] args){
		
		String employeeName = "Bryan Hayes";
		String employeePPSNo = "6464514D";
		String employeeDpt = "IT";
		double basicHoursWorked = 50.50;
		double overtimeHoursWorked = 13.50;
		double basicHourlyRate = 29.35;
		double overtimeFactor = 1.50;
		final double incomeTaxRate = 0.35;
		
		double basicSalary = (basicHourlyRate * basicHoursWorked);
		double overtimeSalary = (basicHourlyRate * overtimeHoursWorked) * overtimeFactor;
		double grossPay = (basicSalary + overtimeSalary);
		double incomeTaxPayable = (grossPay * incomeTaxRate);
		
		double netPay = (grossPay - incomeTaxPayable);
		
		System.out.println("");
		System.out.println("********************Salary Report**************************");
		System.out.println("");
		System.out.println("********************Employee Details***********************");
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee PPS No: " + employeePPSNo);
		System.out.println("Employee Department: " + employeeDpt);
		System.out.println("");
		System.out.println("********************Hours Worked***************************");
		System.out.println("No. of basic hours worked: " + basicHoursWorked);
		System.out.println("The hourly rate of basic pay is at " + basicHourlyRate + " euro.");
		System.out.println("Basic salary: " + basicSalary);
		System.out.println("No. of overtime hours worked: " + overtimeHoursWorked);
		System.out.println("The hourly rate of overtime pay is at time and a half.");
		System.out.println("Overtime salary: " + overtimeSalary);
		System.out.println("");
		System.out.println("********************Take Home Pay**************************");
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Income Tax Payable at: " + incomeTaxRate + " is: " + incomeTaxPayable);
		System.out.println("Net Pay: " + netPay);
		System.out.println("");
		System.out.println("***********************************************************");
	
	}
	
}