package exercBancoSantander;

public class CurrentAccount extends Account {

	private double overdraftLimit;

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setLimiteChequeEspecial(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public boolean depositCheck(Check check) {
		this.depositAmount(this.checkBalance() + check.getValue());
		return true;
	}

	
	public boolean sacarValor(double value) {
		if(super.withdrawValue(value)) {
			if(value < 0) {
				return false;
			} else if(value > 0 && value > this.checkBalance() + this.overdraftLimit) {
				return false;
			}else {
				value -= this.checkBalance();
				this.withdrawValue(this.checkBalance());
				this.overdraftLimit -= value;
				return true;
			}
		} else {
			return true;
		}
		
	}

}

