package OOSEAssignment;


public class AddonPrice extends Calculation{
	private int a,b,c,d;
	
	public AddonPrice(int a,int b,int c,int d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	public void calculatePrice() {
		total=a*18.50+b*15.25+c*16.88+d*12.5;
	}
}
