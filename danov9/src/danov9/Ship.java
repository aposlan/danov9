package danov9;

public class Ship extends Vehicle implements isSeaVessel{

	private int deadweight;
	
	public Ship(int maxSpeed, String model, double price, int deadweight) {
		super(maxSpeed, model, price);
		this.deadweight = deadweight;
	}

	public int getDeadweight() {
		return deadweight;
	}

	public void setDeadweight(int deadweight) {
		this.deadweight = deadweight;
	}

	@Override
	public void enterSea() {
		System.out.println("Движиш се по вода.");
	}

	@Override
	public double checkPromo() {
		return getPrice() - (getPrice()*0.003);
	}
	
	@Override
	public double checkPromo(int discount) {
		return getPrice() - (getPrice()*discount/100);
	}
	
	
	
}
