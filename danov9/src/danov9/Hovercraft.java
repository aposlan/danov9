package danov9;

public class Hovercraft extends Vehicle implements isLandVehicle, isSeaVessel{

	private int passengers;
	
	public Hovercraft(int maxSpeed, String model, double price, int passengers) {
		super(maxSpeed, model, price);
		this.passengers = passengers;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	@Override
	public void enterSea() {
		System.out.println("Движиш се по вода.");
	}

	@Override
	public void enterLand() {
		System.out.println("Движиш се по земя.");
	}

	@Override
	public double checkPromo() {
		return getPrice() - (getPrice()*0.03);
	}
	
	@Override
	public double checkPromo(int discount) {
		return getPrice() - (getPrice()*discount/100);
	}
	
	
	
}
