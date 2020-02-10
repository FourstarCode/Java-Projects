package topic6Exercises;


public class JFT6Ex12
{
	
	public static void main(String[] args)
	{
		
		char status = 'D';
		
		switch (status)
		{
			case 'S':
				System.out.println("Status: Single");
				break;
				
			case 'D':
				System.out.println("Status: Divorced");
				break;
			
			case 'M':
				System.out.println("Status: Married");
				break;
				
			case 'W':
				System.out.println("Status: Widowed");
				break;
				
			default:
				System.out.println("Invalid input");
				break;
				
		}
	}
}
		