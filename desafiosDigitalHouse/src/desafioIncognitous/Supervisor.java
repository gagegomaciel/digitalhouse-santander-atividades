package desafioIncognitous;

import java.util.Date;

public class Supervisor extends FuncionarioPf{

	public void getBonificacao() {
		var bonificacao = this.salarioBase * 0.08;
	}

	public Supervisor(String nome, String cpf, String endereco, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao) {
		super(nome, cpf, endereco, setor, salarioBase, dataAdmissao, dataDemissao);
	}
}