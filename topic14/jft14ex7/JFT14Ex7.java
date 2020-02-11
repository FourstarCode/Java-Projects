package jft14ex7;
import java.io.*;

public class JFT14Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFT14Ex7().writeToFile();
	}
	
	public void writeToFile() {
		File file = new File("My Poem.txt");
		
		try {
			FileWriter fw = new FileWriter(file,true);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("The quick brown fox jumped over the moon. \n"
					+ "As he leapt, he looked back over his shoulder and cried aloud,"
					+ "\nHello World!");
			
			System.out.println("Success!");
			
			pw.close();
		}catch(IOException e) {
			System.out.println("Unable to write to the file at this time.");
		}
	}
}
