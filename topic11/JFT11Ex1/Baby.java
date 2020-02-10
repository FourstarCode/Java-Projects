package JFT11Ex1;

public class Baby extends Human{
	
	private boolean isTeething;
	
	public void setIsTeething(boolean isTeething){
		this.isTeething = isTeething;
	}
	
	public boolean getIsTeething(){
		return isTeething;
	}
	
	public String sleep(){
		if(isTeething==false){
			return "Sleeping soundly...";
		}else{
			return "Baby having difficulty sleeping due to teething pain.";
		}
	}
	
	public String swim(){
		return "A baby cannot swim safely...";
	}
	
	public String toString(){
		return super.toString() + "\n "+ "Teething: " + isTeething;
	}
}
	