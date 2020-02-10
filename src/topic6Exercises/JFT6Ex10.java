package topic6Exercises;


public class JFT6Ex10{
	
	public static void main(String[] args){
		
		String dayOfWeek = "Monday";
		
		switch (dayOfWeek){
			
			case "Monday":
				System.out.println("The day is Monday");
				break;
			case "Tuesday":
				System.out.println("The day is Tuesday");
				break;
			case "Wednesday":
				System.out.println("The day is Wednesday");
				break;
			case "Thursday":
				System.out.println("The day is Thursday");
				break;
			case "Friday":
				System.out.println("The day is Friday");
				break;
			case "Saturday":
				System.out.println("The day is Saturday");
				break;
			case "Sunday":
				System.out.println("The day is Sunday");
				break;
			default:
				System.out.println("Invalid input");
				break;
		}
	}
}