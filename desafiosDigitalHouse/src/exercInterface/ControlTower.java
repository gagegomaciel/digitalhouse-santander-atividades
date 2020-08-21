package exercInterface;

public class ControlTower {

	Flying flying[];

	public ControlTower(Flying[] flying) {
		super();
		this.flying = flying;
	}

	public void flyInAll() {
		for (var i : this.flying) {
			i.fly();
		}
		System.out.println("==========================");
	}

}
