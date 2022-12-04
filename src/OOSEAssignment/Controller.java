package OOSEAssignment;

public class Controller {
	static Person p = new Person();
	static Booking b = new Booking();
	static BookingRecord bookingrecord = new BookingRecord();
	
	public void setUserDetails() {
		p.setDetails("Siti", "Huda", "888888-88-8888", "sitimiza@gmail.com", "012-8654862");
	}
	
	public void openMenu() {
		ScreenMenu.NewScreen();
	}
	public void openBooking() {
		ScreenBooking.Booking();
	}
	public void setTicketDetails(String locDes) {
		b.setOrderID();
		b.setLocationDestination(locDes);
	}
	public void calculateTicketPrice(int totalKid, int totalAdult, double kidPrice, double adultPrice) {
		b.setTotalKid(totalKid);
		b.setTotalAdult(totalAdult);
		b.calculateTicketPrice(kidPrice,adultPrice);
	}
	public String getTicketPrice() {
		return Double.toString(b.getTicketPrice());
	}
	public void openFoodBeverage() {
		ScreenFoodBeverage.foodbeverage();
	}
	public void setAddonDetails(int foodlist1,int foodlist2, int foodlist3, int foodlist4) {
		b.setFoodPackage(foodlist1,foodlist2,foodlist3,foodlist4);
	    b.calculateAddonPrice();
	}
	public String getAddonPrice() {
		return Double.toString(b.getAddonPrice());
	}
	public void openPayment() {
		ScreenPayment.payment();
	}
	public void openFPX() {
		ScreenFPX.fps();
	}
	public void openFPXPayment() {
		ScreenFPXPayment.fpspayment();
	}
	public void openEWallet() {
		ScreenWallet.wallet();
	}
	public void setPayment(String payment) {
		b.setPayment(payment);
	}
	public String getTotalPrice() {
		return Double.toString(b.getTotalPrice());
	}
	public void openSummary() {
		ScreenSummary.Summary();
	}
	public String getSummary() {
		return "First Name\t: "+p.getFirstName()+"\nLast Name\t: "+p.getLastName()
			+"\nNo IC\t: "+p.getIC()+"\nEmail\t: "+p.getEmail()+"\nPhone Number\t: "+p.getTelNum()
			+"\nOrder ID\t: "+b.getOrderID()+"\nDepart-Arrival\t: "+b.getLocationDestination()
			+"\nTotal Kid\t: "+b.getTotalKid()+"\nTotal Adult\t: "+b.getTotalAdult()
			+"\nPayment\t: "+b.getPayment()+"\nPackage A\t: "+b.getQuantityA()
			+"\nPackage B\t: "+b.getQuantityB()+"\nPackage C\t: "+b.getQuantityC()+"\nPackage D\t: "+b.getQuantityD()
			+"\nTotal Price\t: RM"+String.valueOf(String.format("%.2f", b.getTotalPrice()));
	}
	public void refreshValue() {
		b.setLocationDestination("");
		b.setTotalKid(0);
		b.setTotalAdult(0);
		b.addonPrice =0;
		b.ticketPrice =0;
		b.setFoodPackage(0, 0, 0, 0);
		b.setPayment("");
	}
	public void saveBookingRecord() {
		bookingrecord.saveBookingRecord(b);
		refreshValue();
	}
	public boolean openHistory() {
		if(!bookingrecord.stack.isEmpty()) {
			new ScreenHistory(bookingrecord.getHistoryData());
			return true;
		}
		else 
			return false;
	}
	public void openList() {
		ScreenList.list();
	}
	public void openBankList() {
		new ScreenBankList();
	}
	public void openFoodPackageList() {
		new ScreenFoodPackageList();
	}
	public void openDepartArrival() {
		new ScreenDepartArrivalList();
	}
}
