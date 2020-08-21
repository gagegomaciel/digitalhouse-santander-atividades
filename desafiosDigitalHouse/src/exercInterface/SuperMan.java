package exercInterface;

public class SuperMan implements Flying {

protected int experience;
	
	public void fly() {
		this.experience += 3;
		System.out.println("- Estou voando como um campeão.");
	}

}
