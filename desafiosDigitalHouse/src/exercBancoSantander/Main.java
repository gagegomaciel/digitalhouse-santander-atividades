package exercBancoSantander;

public class Main {

	public static void main(String[] args) {
		var account = new CurrentAccount();
		var check = new Check(2000, "BB", null);
		
		account.depositAmount(500);
		System.out.println(account.checkBalance());
		account.depositCheck(check);
		System.out.println(account.checkBalance());
		account.withdrawValue(100);
		System.out.println(account.checkBalance());
	}

}

