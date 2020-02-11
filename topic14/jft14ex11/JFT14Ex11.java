package jft14ex11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JFT14Ex11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFT14Ex11().methodA();
		
	}
	
	public void methodA(){
		new JFT14Ex11().methodB();
	}
	public void methodB() {
		File file = new File("topic14\\jft14Ex10\\Output.txt");
		
		
		
		try{
				FileWriter fw = new FileWriter(file, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.println("I am learning Java programming!");
				System.out.println("Success!");
				pw.close();
		}catch(IOException e) {
			System.out.println("Unable to write to the file at this time.");
		}
	}
}

