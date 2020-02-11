package jft14Ex10;

import java.io.*;

public class JFT14Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			new JFT14Ex10().methodA();
		}catch(IOException e) {
			System.out.println("Unable to write to the file at this time");
		}
	}
	
	public void methodA() throws IOException {
		new JFT14Ex10().methodB();
	}
	public void methodB() throws IOException {
		File file = new File("topic14\\jft14Ex10\\Output.txt");
		
		
			FileWriter fw = new FileWriter(file,true);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("I am learning Java programming!");
			System.out.println("Success!");
			pw.close();
		
	}
}
