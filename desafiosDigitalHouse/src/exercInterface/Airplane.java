package exercInterface;

public class Airplane implements Flying {

	protected static int numberAirplane = 0;
	private double flightHours;

	public Airplane() {
		super();
		Airplane.numberAirplane += 1;
	}

	public void voar() {
		this.flightHours += 13;
		System.out.println("- Estou voando como um avião, e tenho " + this.flightHours + " horas de voo.");
	}

}

