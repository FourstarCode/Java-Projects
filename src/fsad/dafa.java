package fsad;

public class dafa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int noOfTicketsRemaining = 5;
		    int noOfTicketsDesired = 12;
		    String sellTicketMessage = "Sale made";
		    String noTicketSaleMessage = "No sale, not enough tickets remaining";

		       if(noOfTicketsDesired <= noOfTicketsRemaining){
		         System.out.printf("%s",sellTicketMessage);
		       }else{
		        System.out.printf("%d",noTicketSaleMessage);
		      }
		}

}
