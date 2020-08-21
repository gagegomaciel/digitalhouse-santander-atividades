package desafioIncognitous;

import java.util.Date;

public class FuncionarioPj extends Funcionario{
	protected String cnpj;

	public FuncionarioPj(String nome, String cpf, String endereco, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao) {
		super(nome, cpf, endereco, setor, salarioBase, dataAdmissao, dataDemissao);
	}
}
