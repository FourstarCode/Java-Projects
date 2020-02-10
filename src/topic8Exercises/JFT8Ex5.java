package topic8Exercises;


public class JFT8Ex5
{
	public static void main(String[] args)
	{
		String artists[] = {"Michael Jackson", "Frankie Goes to Hollywood", "Queen", "Simple Minds", "Rick Astley"};
		int position[] = {5,4,3,2,1};
		
		for(int i = 0;i < artists.length; i++)
		{			
			System.out.println("No " + position[i] + ": " + artists[i]);		
		}
	}
}