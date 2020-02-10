package jft12ex12;

public class JFT12Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Daniel Franks";
		int age = 30;
		int averageAge = 23;
		
		if(age>averageAge) {
			System.out.printf("%s - your age of %d is greater than the average age <%d>" ,name,age,averageAge);
		}else {
			System.out.printf("%s - your age of %d is less than the average age <%d>" ,name,age,averageAge);
		}
	}

}
