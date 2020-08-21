package exercBancoSantander;

public class Client {
	
	private int numberClient;
	private String sobreNome;
	private String cpf;
	private String rg;
	
	public Client(int numberClient, String sobreNome, String cpf, String rg) {
		this.numberClient = numberClient;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public int getNumberClient() {
		return numberClient;
	}
	
	public void setNumberClient(int numberClient) {
		this.numberClient = numberClient;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}

}

