package jft14ex12;

public class JFT14Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFT14Ex12().methodA();
	}

	public void methodA() {
		new JFT14Ex12().methodB();
		
	}
	public void methodB() {
		
		int numbers[] = {10,20,40};
		try{
			System.out.println(numbers[100]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: bad index");
		}
	}
}
