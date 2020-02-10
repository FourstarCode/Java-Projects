package JFT10Ex11;

public class Television{
	
	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on_off = false;
	
	public void setChannel(int newChannel){
		if(on_off&&(!((newChannel<1)||(newChannel>120)))){
			this.channel = newChannel;
		}
	}
	public int getChannel(){
		return channel;
	}
	
	public void setVolume(int newVolumeLevel){
		if(on_off &&(!((newVolumeLevel<1)||(newVolumeLevel>7)))){
			this.volumeLevel = newVolumeLevel;
		}
	}
	
	public int getVolume(){
		return volumeLevel;
	}
	
	public void setOn_Off(boolean on_off){
		if(on_off==true){
			this.on_off = true;
		}
		else{
			this.on_off = false;
		}
	}
	
	public boolean getOn_Off(){
		return on_off;
	}
	
	public void channelUp(){
		if(on_off&&(!(channel>=120))){
			channel++;
		}
	}
	public void channelDown(){
		if(on_off&&(!(channel<=1))){
			channel--;
		}
	}
	
	public void volumeUp(){
		if(on_off&&(!(volumeLevel>=7))){
			volumeLevel++;
		}
	}
	
	public void volumeDown(){
		if(on_off&&(!(volumeLevel<=1))){
			volumeLevel--;
		}
	}
	
	public String toString(){
		return "Channel = " + channel + ", VolumeLevel = " + volumeLevel + ", on = " + on_off;
	}
}
			