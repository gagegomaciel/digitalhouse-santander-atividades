package exercBancoSantander;

import java.util.Date;

public class Check {

	private double value;
	private String emittingBank;
	private Date paymentDate;

	public Check(double value, String emittingBank, Date paymentDate) {
		
		this.value = value;
		this.emittingBank = emittingBank;
		this.paymentDate = paymentDate;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getEmittingBank() {
		return emittingBank;
	}

	public void setEmittingBank(String emittingBank) {
		this.emittingBank = emittingBank;
	}

	public Date getDataPagamento() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

}

