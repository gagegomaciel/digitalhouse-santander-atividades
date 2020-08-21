package exercBancoSantander;

public class Account {

	private double balance;

	public boolean depositAmount(double value) {
		if(value > 0) {
			this.balance += value;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean withdrawValue(double value) {
		if(value < 0 || this.balance < value) {
			return false;
		} else {
			this.balance -= value;
			return true;
		}
	}
	
	public double checkBalance() {
		return this.balance;
	}

}