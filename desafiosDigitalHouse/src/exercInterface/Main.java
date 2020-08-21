package exercInterface;

public class Main {

	public static void main(String[] args) {
		var duck = new Duck();
		var airplane = new Airplane();
		var superMan = new SuperMan();
		flying[] arraiFlights = {duck, airplane, superMan};
		var controlTower = new ControlTower(arraiFlights);

		controlTower.flyInAll();
		controlTower.flyInAll();
		controlTower.flyInAll();
		controlTower.flyInAll();
		
	}

}
