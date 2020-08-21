package desafioIncognitous;

import java.util.Date;

public class FuncionarioPf extends Funcionario{
	public FuncionarioPf(String nome, String cpf, String endereco, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao) {
		super(nome, cpf, endereco, setor, salarioBase, dataAdmissao, dataDemissao);
	}

	protected String nit;
}