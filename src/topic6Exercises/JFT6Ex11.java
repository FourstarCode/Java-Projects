package topic6Exercises;


public class JFT6Ex11{
	
	public static void main(String[] args){
		
		int bonusBall = 47;
		String messageHaveBonus = "You have the lucky bonus ball number!";
		String messageNoBonus = "Better luck next time!";
		
		switch (bonusBall){
		
			case 47:
			System.out.println(messageHaveBonus);
			break;
			
			default:
			System.out.println(messageNoBonus);
			break;
		}
	}
}