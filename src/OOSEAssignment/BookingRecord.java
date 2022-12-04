package OOSEAssignment;

import java.util.Stack;

public class BookingRecord {
	Stack<String> stack = new Stack<String>();
	String [][]rows;
	
	public void saveBookingRecord(Booking b) {
		stack.push(Double.toString(b.getTotalPrice()));
		stack.push(Integer.toString(b.getQuantityD()));
		stack.push(Integer.toString(b.getQuantityC()));
		stack.push(Integer.toString(b.getQuantityB()));
		stack.push(Integer.toString(b.getQuantityA()));
		stack.push(b.getPayment());
		stack.push(Integer.toString(b.getTotalKid()));
		stack.push(Integer.toString(b.getTotalAdult()));
		stack.push(b.getLocationDestination());
		stack.push(b.getOrderID());
		setRecord();
	}
	public void setRecord(){
		int lastdigit = Integer.parseInt(stack.peek().substring(4,5));
		rows = new String[lastdigit][10];
		int n=0;
		for(int i=0;i<lastdigit;i++) {
			for(int j=9;j>=0;j--) {
				rows[i][j] = stack.elementAt(n); 
				n++;
			}
		}
	}
	public String[][] getHistoryData(){
		return rows;
	}
}
