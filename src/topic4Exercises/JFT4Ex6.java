package topic4Exercises;


public class JFT4Ex6{
		
	public static void main(String[] args){
		
		int sum = 57;
		int decreasingAmount = sum;
		int note20 = 0;//sum/20;
		int note10 = 0;//note20/note10;
		int note5 = 0;
		int coin1 = 0;
		
		System.out.println("**************Coin Machine**************");
		System.out.println("Sum of money is " + sum + " euro.");
		note20=sum/20;
		decreasingAmount=sum%20;
		System.out.println("No of 20's: " + note20);
		note10 = decreasingAmount/10;
		decreasingAmount %= 10;
		System.out.println("No of 10's: " + note10);
		note5 = decreasingAmount/5;
		decreasingAmount %= 5;
		System.out.println("No of 5's: " + note5);
		coin1 = decreasingAmount/1;
		System.out.println("No of 1's: " + coin1);
		System.out.println("****************************************");
	}
}