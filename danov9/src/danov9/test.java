package danov9;

public class test {

	public static void main(String[] args) {
		
		Car car = new Car(240, "Tesla", 10000, 233);
		Hovercraft hovercraft = new Hovercraft(120, "WaterMotors", 10000, 4);
		Ship ship = new Ship(160, "SouthShips", 10000000, 5000000);
		
		System.out.println(car.checkPromo());
		System.out.println(hovercraft.checkPromo());
		System.out.println(ship.checkPromo());
		
		System.out.println("--------------------");
		
		System.out.println(car.checkPromo(50));
		System.out.println(hovercraft.checkPromo(10));
		System.out.println(ship.checkPromo(25));
		
		System.out.println("--------------------");
		
		System.out.println("Car : ");
		car.enterLand();
		
		System.out.println("--------------------");
		
		System.out.println("Hovercraft : ");
		hovercraft.enterLand();
		hovercraft.enterSea();
		
		System.out.println("--------------------");
		
		System.out.println("Ship : ");
		ship.enterSea();
		
		
	}

}
