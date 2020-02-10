package topic6Exercises;


public class JFT6Ex9{
	
	public static void main(String[] args){
		
		float temp = 14.19f;
		
		if (temp >= 20){
			System.out.println("Tropical temperature");
		}
		else if (temp >= 10 && temp < 20){
			System.out.println("Warm temperature");
		}
		else if (temp >= 0 && temp < 10){
			System.out.println("Moderate temperature");
		}
		else if (temp >= -4 && temp <= -1){
			System.out.println("Cold temperature");
		}
		else if (temp > -5){
			System.out.println("Arctic temperature");
		}
	}
}