package topic3Exercises;

public class JFT3Ex2{
	public static void main(String[] args){
		//Variable Declaration and Assignment
		String firstName = "John";
		char middleInitial = 'B';
		String lastName = "Hayes";
		final String ppsNo = "56473145";
		int age = 34;
		String department = "IT";
		byte performanceRating = 3;
		float basicSalary = 45909.56F;
		boolean bonusAwarded = true;
		double bonus = 10000.04;
		double totalSalary = (basicSalary + bonus);
		
		System.out.println(firstName + "\n"
		+ middleInitial + "\n"
		+ lastName + "\n"
		+ ppsNo + "\n"
		+ age + "\n"
		+ department + "\n"
		+ performanceRating + "\n"
		+ basicSalary + "\n"
		+ bonusAwarded + "\n"
		+ bonus + "\n"
		+ totalSalary + "\n");
	}
}