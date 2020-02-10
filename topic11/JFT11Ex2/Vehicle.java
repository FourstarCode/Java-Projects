package JFT11Ex2;

public class Vehicle{
	
	private String manufacturer;
	private float engineSize;
	private String registrationNo;
	private boolean NCT;
	
	public Vehicle(String manufacturer, float engineSize, String registrationNo, boolean NCT){
		this.manufacturer = manufacturer;
		this.engineSize = engineSize;
		this.registrationNo = registrationNo;
		this.NCT = NCT;
	}
	
	public Vehicle(String manufacturer, float engineSize, String registrationNo){
		this(manufacturer,engineSize,registrationNo,false);
	}
	
	public Vehicle(String manufacturer,float engineSize){
		this(manufacturer,engineSize,"not specified",false);
	}
	
	public Vehicle(String manufacturer){
		this(manufacturer,0.0f,"not specified",false);
	}
	
	public Vehicle(){
		this("not specified",0.0f,"not specified",false);
	}
	
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer(){
		return manufacturer;
	}
	
	public void setEngineSize(float engineSize){
		this.engineSize = engineSize;
	}
	
	public float getEngineSize(){
		return engineSize;
	}
	
	public void setRegistrationNo(String registrationNo){
		this.registrationNo = registrationNo;
	}
	
	public String getRegistrationNo(){
		return registrationNo;
	}
	
	public void setNCT(boolean NCT){
		this.NCT = NCT;
	}
	
	public boolean getNCT(){
		return NCT;
	}
	
	public String accelerate(){
		return "Accelerating...";
	}
	
	public String brake(){
		return "Vehicle braking...";
	}
	
	public String toString(){
		return "Manufacturer: " + manufacturer + "\n" + "Engine Size: " + engineSize + "\n"
		+ "Registration Number: " + registrationNo + "\n" + "NCT: " + NCT;
	}
}