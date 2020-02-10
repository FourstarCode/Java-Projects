package topic8Exercises;


public class JFT8Ex12
{
	public static void main(String[] args)
	{
		int ages[] = {34,16,31,19,30,19,32,11,12,13};
		String names[] = {"John Walsh","Frank Hayes","Anna Davis","Jennifer Burns","Francis Burke","Fred Smith","Phillipa Smith","Jason Button","Ian Hayes","Derva Conway"};
		
		for(int i = 0;i<ages.length;i++)
		{
			if(ages[i] < 18)
			{
				continue;
			}
			else
			{
				System.out.println(names[i] + " You are eligible to vote. "
				+ "Proceed to your polling station");				
			}
		}
	}
}