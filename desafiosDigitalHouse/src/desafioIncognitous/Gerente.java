package desafioIncognitous;

import java.util.Date;

public class Gerente extends FuncionarioPf{
	
	public Gerente(String nome, String cpf, String endereco, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao) {
		super(nome, cpf, endereco, setor, salarioBase, dataAdmissao, dataDemissao);
	}

	public void getBonificacao() {
		var bonificacao = this.salarioBase * 0.12;
	}
}
