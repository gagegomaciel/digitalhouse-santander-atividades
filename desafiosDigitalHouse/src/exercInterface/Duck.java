package exercInterface;

public class Duck implements Flying {

	protected static int numberDucks = 0;
	private int energy = 100;

	public Duck() {
		Duck.numberDucks += 1;
	}

	public void fly() {
		if(this.energy > 0) {
			this.energy -= 5;
			System.out.println("- Estou voando como um pato.");
		}else {
			System.out.println("- Não tenho energia suficiente para voar.");
		}
	}

}
