package JFT10Ex10;

public class IQ{
	
	private String name;
	private int age;
	private float iQScore;
	
	public void setAge(int age){
		if((age<0)|| (age>115)){
			this.age = 0;
		}
		else{
			this.age = age;
		}
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setIQScore(float iQScore){
		if((iQScore<0) ||(iQScore>200)){
			this.iQScore = 0;
		}
		else{
			this.iQScore = iQScore;
		}
	}
	
	public float getIQScore(){
		return this.iQScore;
	}
	
	public String iQReport(){
		if(iQScore < 100){
			return "Your score of " + getIQScore() + " is below average.";
		}else if( (iQScore > 100) && (iQScore <= 150) ){
			return "Your score of " + getIQScore() + " is above average.";
		}else{
			return "Your score of " + getIQScore() + " is exceptional.";
		}
	}
	
	public String toString(){
		return "Name: " + name + " " + "Age: " + age + " " + "IQ Score: " + iQScore;
	}
	
}
