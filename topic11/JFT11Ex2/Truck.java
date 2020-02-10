package JFT11Ex2;

public class Truck extends Vehicle{
	
	private boolean isTrailer;
	
	public Truck(String manufacturer,float engineSize, String registrationNo, boolean NCT){
		super(manufacturer,engineSize,registrationNo,NCT);
	}
	
	public Truck(String manufacturer,float engineSize, String registrationNo){
		this(manufacturer,engineSize,registrationNo,false);
	}
	
	public Truck(String manufacturer,float engineSize){
		this(manufacturer,engineSize,"not specified",false);
	}
	
	public Truck(String manufacturer){
		this(manufacturer,0.0f,"not specified",false);
	}
	
	public Truck(){
		this("not specified",0.0f,"not specified",false);
	}
	
	public void setIsTrailer(boolean isTrailer){
		this.isTrailer = isTrailer;
	}
	
	public boolean getIsTrailer(){
		return isTrailer;
	}
	
	@Override
	public String brake(){
		return "Truck braking...";
	}
	
	public String toString(){
		return super.toString() + "\nHas Trailer? " + isTrailer;
	}
	
}