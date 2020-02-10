package topic8Exercises;


public class JFT8Ex19
{
	public static void main(String[] args)
	{
		char answer[] = {'Y','Y','Y','Y','Y','Y','N','Y','N','N'};
		int yesCount = 0;
		int noNeeded = 7;
		boolean goAhead = false;
		int loop = 0;
		while(loop < 10)
		{
			
			if(answer[loop]=='Y')
			{
				yesCount++;
			}
			loop++;
			if(yesCount==noNeeded)
			{
				goAhead=true;
				break;
			}
		}
		
		if(goAhead==true)
		{
			System.out.println("the fishing trip is going ahead!");
		}
		else
		{
			System.out.println("The trip is not going ahead");
		}
	}
}