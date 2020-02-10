package topic6Exercises;


public class JFT6Ex5{
	
	public static void main(String[] args){
		
		int balance = 180;
		int withdrawal = 20;
		String message;
		
		message = (withdrawal>balance) ? ("Insufficient Funds") : ("Withdrawal processed");
		System.out.println(message);
	}
}