package topic6Exercises;


public class JFT6Ex8{
	
	public static void main(String[] args){
		
		float percentMark = 45F;
		char grade = 'A';
		
		if (percentMark<=100&&percentMark>=85){
			grade = 'A';
		}
		else if (percentMark<85&&percentMark>=70){
			grade = 'B';
		}
		else if (percentMark<70&&percentMark>=55){
			grade = 'C';
		}
		else if (percentMark<55&&percentMark>=40){
			grade = 'D';
		}
		else if (percentMark<40&&percentMark>=25){
			grade = 'E';
		}
		else if (percentMark<25&&percentMark>=10){
			grade = 'F';
		}
		else if (percentMark<10&&percentMark>=0){
			grade = 'N';
		}
		switch(grade){
			case 'A': 
				System.out.println("Grade achieved: " + grade);
				break;
			case 'B':
				System.out.println("Grade achieved: " + grade);
				break;
			case 'C':
				System.out.println("Grade achieved: " + grade);
				break;
			case 'D':
				System.out.println("Grade achieved: " + grade);
				break;
			case 'E':
				System.out.println("Grade achieved: " + grade);
				break;
			case 'F':
				System.out.println("Grade achieved: " + grade);
				break;
			case 'N':
				System.out.println("No grade achieved");
				break;
			default:
				System.out.println("Invalid input");
				break;
		}
	}
}
				
		