package OOSEAssignment;

public class TicketPrice extends Calculation {
	protected int totalKid,totalAdult;
	protected double kidPrice =0, adultPrice=0;
	Controller c=new Controller();
	
		public TicketPrice(int totalKid, int totalAdult,double kidPrice,double adultPrice) {
			this.totalKid = totalKid;
			this.totalAdult = totalAdult;
			this.kidPrice = kidPrice;
			this.adultPrice = adultPrice;
		}
		
		public void calculatePrice() {
			total = (totalKid * kidPrice) + (totalAdult * adultPrice) ;
		}
			
}
