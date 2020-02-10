package JFT10Ex11;

public class Test{
	
	public static void main(String[] args){
		
		Television t1 = new Television();
		
		t1.setOn_Off(true);
		t1.setChannel(100);
		t1.setVolume(5);
		
		t1.channelUp();
				
		t1.channelDown();
		
		t1.volumeUp();
		
		t1.volumeUp();
		
		t1.volumeDown();
		
		t1.setOn_Off(false);
		
		System.out.println(t1.toString());
		
	}
}