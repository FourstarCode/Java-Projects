package JFT11Ex2;

public class Car extends Vehicle{

	private static int noCarsProduced;
	
	public Car(String manufacturer, float engineSize, String registrationNo, boolean NCT){
		super(manufacturer,engineSize,registrationNo,NCT);
		Car.noCarsProduced++;
	}
	
	public Car(String manufacturer,float engineSize, String registrationNo){
		this(manufacturer,engineSize,registrationNo,false);
	}
	
	public Car(String manufacturer, float engineSize){
		this(manufacturer,engineSize,"not specified",false);
	}
	
	public Car(String manufacturer){
		this(manufacturer,0.0f,"not specified",false);
	}
	
	public Car(){
		this("not specified", 0.0f, "not specified", false);
	}
	
	@Override
	public String brake(){
		return "Car braking...";
	}
	
	public static int getNoCarsProduced(){
		return noCarsProduced;
	}
}

	