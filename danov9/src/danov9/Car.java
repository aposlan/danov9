package danov9;

public class Car extends Vehicle implements isLandVehicle{
	
	private int enginePower;
	
	public Car(int maxSpeed, String model, double price, int enginePower) {
		super(maxSpeed, model, price);
		this.enginePower = enginePower;
	}

	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}

	@Override
	public void enterLand() {
		System.out.println("Движиш се по земя.");
	}

	@Override
	public double checkPromo() {
		return getPrice() - (getPrice()*0.2);
	}
	
	@Override
	public double checkPromo(int discount) {
		return getPrice() - (getPrice()*discount/100);
	}
	
	

}
