package topic6Exercises;


public class JFT6Ex4{
	
	public static void main(String[] args){
		
		int withdraw = 20;
		int balance = 180;
		int newBalance = 0;
		
		if(withdraw < balance){
			
			newBalance = balance - withdraw;
			System.out.println("Withdrawal processed: " + withdraw);
			System.out.println("New balance: " + newBalance);
			
		}
		else {
			
			System.out.println("Insufficient funds");
		}
	}
}