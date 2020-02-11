package jft13ex4;

import java.util.*;

public class JFT13Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String employeeName;
		String employeeDepartment;
		String employeePPSNo;
		
		
		String name;
		final double basicHourlyRate = 29.39;
		double basicHoursWorked = 0.0;
		final double overtimeRate = 1.5;
		double overtimeHoursWorked = 0.0;
		
		double basicSalary = 0.0;
		double overtimeSalary = 0.0;
		
		double grossPay = 0.0;
		
		final double incomeTaxRateHigh = 0.35;
		final double incomeTaxRateLow = 0.20;
		String incomeTaxRatePayable = "";
		final double incomeTaxSalaryThreshold = 2000;
		double incomeTaxPayable = 0.0;
		
		double netPay = 0.0;
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("Enter Employee Name: ");
		employeeName = k.nextLine();
		
		System.out.print("Enter Employee PPS NO: ");
		employeePPSNo = k.nextLine();
		
		System.out.print("Enter Employee Department: ");
		employeeDepartment = k.nextLine();
		
		System.out.print("Enter Basic Hours Worked: ");
		basicHoursWorked = k.nextDouble();
		
		System.out.print("Enter Overtime Hours Worked: ");
		overtimeHoursWorked = k.nextDouble();
		
		basicSalary = (basicHourlyRate * basicHoursWorked);
		overtimeSalary = (basicHourlyRate * overtimeHoursWorked) * overtimeRate;
		grossPay = (basicSalary + overtimeSalary);
		incomeTaxPayable = (grossPay > incomeTaxSalaryThreshold) ? (grossPay*incomeTaxRateHigh) : (grossPay*incomeTaxRateLow);
		incomeTaxRatePayable = (grossPay > incomeTaxSalaryThreshold) ? "35%" : "20%";
		netPay = (grossPay - incomeTaxPayable);
		
		System.out.println("");
	    System.out.println("********************Salary Report**************************");
		System.out.println("");
		System.out.println("********************Employee Details***********************");
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee PPS No: " + employeePPSNo);
		System.out.println("Employee Department: " + employeeDepartment);
		System.out.println("");
		System.out.println("********************Hours Worked***************************");
		System.out.println("No. of basic hours worked: " + basicHoursWorked);
		System.out.println("The hourly rate of basic pay is at " + basicHourlyRate + " euro.");
	    System.out.printf("Basic salary: %.2f\n" ,basicSalary);
		System.out.println("No. of overtime hours worked: " + overtimeHoursWorked);
		System.out.println("The hourly rate of overtime pay is at time and a half.");
	    System.out.printf("Overtime salary: %.2f\n",overtimeSalary);
		System.out.println("");
		System.out.println("********************Take Home Pay**************************");
		System.out.printf("Gross Pay: %.2f\n" ,grossPay);
		System.out.printf("Income Tax Payable at: %s is: %.2f\n" ,incomeTaxRatePayable ,incomeTaxPayable);
		System.out.printf("Net Pay: %.2f\n" ,netPay);
		System.out.println("");
		System.out.println("***********************************************************");
		
		
		
	}

}
