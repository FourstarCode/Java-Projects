package JFT10Ex5;

public class NumberRange{
	
	public String checkInRange(int lower_range_value, int upper_range_value, int no_to_search){
		if(no_to_search <= upper_range_value && no_to_search >= lower_range_value){
			return "No. in range";
		}
		else{
			return "No. not in range!";
		}
	}
}
