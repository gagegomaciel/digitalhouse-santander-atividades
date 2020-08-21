package exercBancoSantander;

public class SavingsAccount extends Account {

	private double interestRate = 0.8;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public boolean collectInterest() {
		this.depositAmount(this.checkBalance() * this.interestRate);
		return true;
	}

}

