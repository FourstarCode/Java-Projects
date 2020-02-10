package JFT11Ex1;

public class Adult extends Human{
	
	private String ppsNo;
	private String occupation;
	private boolean isMarried;
	private boolean isCarOwner;
	
	public void setPpsNo(String ppsNo){
		this.ppsNo = ppsNo;
	}
	
	public String getPpsNo(){
		return ppsNo;
	}
	
	public void setOccupation(String occupation){
		this.occupation = occupation;
	}
	
	public String getOccupation(){
		return occupation;
	}
	
	public void setIsMarried(boolean isMarried){
		this.isMarried = isMarried;
	}

	public boolean getIsMarried(){
		return isMarried;
	}
	
	public void setIsCarOwner(boolean isCarOwner){
		this.isCarOwner = isCarOwner;
	}
	
	public boolean getIsCarOwner(){
		return isCarOwner;
	}
	
	public String drive(){
		return "Driving a car safely...";
	}
	
	public String procreate(){
		return "Procreating...";
	}
	
	public String toString(){
		return super.toString() + "\n" + "ppsNo: " + ppsNo + "\n" + "Occupation: " + occupation
		+ "\n" + "Marriage Status: " + isMarried + "\n" + "Car Owner: " + isCarOwner;
	}
}