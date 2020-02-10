package JFT11Ex1;

public class Child extends Human{
	
	private String schoolCardNo = "N/A";
	
	public void setSchoolCardNo(String schoolCardNo){
		this.schoolCardNo = schoolCardNo;
	}
	
	public String getSchoolCardNo(){
		return schoolCardNo;
	}
	
	public String swim(){
		if(super.getAge() <= 5){
			return "As the child is 5 years old or younger, armbands must be worn and" + 
			"parental supervision is required. Arms rotating and pushing the body forward...";
		}
		else{
			return super.swim();
		}
	}

	public String toString(){
		return super.toString() +"\n" + "School Card No: " + schoolCardNo;
	}
		
}