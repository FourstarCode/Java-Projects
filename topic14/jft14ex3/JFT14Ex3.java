package jft14ex3;

public class JFT14Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte numbers[] = {6,5,4,3,2,1};
		
		try {
			System.out.println(numbers[2500]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Unable to access data - bad index");
		}
	}

}
