package desafioIncognitous;

import java.util.Date;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected String endereco;
	protected String setor;
	protected double salarioBase;
	protected Date dataAdmissao;
	protected Date dataDemissao;
	protected Date ultimasFerias;
	
	public Funcionario(String nome, String cpf, String endereco, String setor, double salarioBase, Date dataAdmissao, Date dataDemissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.setor = setor;
		this.salarioBase = salarioBase;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
	}
	
	protected double contaCheque() {
		return this.salarioBase;
	}
	
	
}