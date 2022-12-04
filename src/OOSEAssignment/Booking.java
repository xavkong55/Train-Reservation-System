package OOSEAssignment;
import java.util.Stack;

public class Booking {
	private String orderID="A1001",locationDestination="",addon,paymentMethod,paymentName;
	private int totalKid=0,totalAdult=0;;
	double ticketPrice =0,addonPrice=0;
	private int a,b,c,d;
	Stack <String> stack = new Stack<String>();
	
	public void setOrderID() {
		if(!stack.isEmpty()) {
			String id = stack.peek();
			String alp = id.substring(0,1);
			int num = Integer.parseInt(id.substring(1,5)) + 1;
			orderID = alp + Integer.toString(num);
			stack.push(orderID);
		}
		else {
			stack.push("A1001");
		}
	}
	
	public String getOrderID() {
		return this.orderID;
	}
	public void setLocationDestination(String locationDestination) {
		this.locationDestination = locationDestination;
	}
	public String getLocationDestination() {
		return this.locationDestination;
	}
	public void setTotalKid(int totalKid) {
		this.totalKid = totalKid;
	}
	public int getTotalKid() {
		return this.totalKid;
	}
	public void setTotalAdult(int totalAdult) {
		this.totalAdult = totalAdult;
	}
	public int getTotalAdult() {
		return this.totalAdult;
	}
	
	public void setFoodPackage(int a,int b,int c,int d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	public int getQuantityA() {
		return a;
	}
	public int getQuantityB() {
		return b;
	}
	public int getQuantityC() {
		return c;
	}
	public int getQuantityD() {
		return d;
	}

	public void calculateTicketPrice(double kidPrice, double adultPrice) {
		Calculation ticketPrice = new TicketPrice(this.totalKid, this.totalAdult,kidPrice,adultPrice);
		ticketPrice.calculatePrice();
		this.ticketPrice = ticketPrice.getTotal();
	}

	public void calculateAddonPrice() {
		Calculation addonPrice = new AddonPrice(a,b,c,d);
		addonPrice.calculatePrice();
		this.addonPrice = addonPrice.getTotal();
	}
	public double getTicketPrice() {
		return Double.parseDouble(String.format("%.2f",ticketPrice));
	}
	public double getAddonPrice() {
		return Double.parseDouble(String.format("%.2f",addonPrice));
	}
	public double getTotalPrice() {
		return Double.parseDouble(String.format("%.2f", ticketPrice + addonPrice));
	}
	public void setPayment(String paymenMethod) {
		this.paymentMethod = paymenMethod;
	}
	public String getPayment() {
		return paymentMethod;
	}
	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}
	public String getPaymentName() {
		return paymentName;
	}
}
