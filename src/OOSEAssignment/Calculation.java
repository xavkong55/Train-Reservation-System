package OOSEAssignment;

public abstract class Calculation {
	protected double total;
	
	public abstract void calculatePrice();

	public double getTotal() {
		return Double.parseDouble(String.format("%.2f", total));
	}
}
