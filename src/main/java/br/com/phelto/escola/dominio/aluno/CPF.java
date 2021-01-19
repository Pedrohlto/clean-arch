package br.com.phelto.escola.dominio.aluno;
import lombok.Getter;

@Getter
public class CPF {

	private String cpf;
	
	public CPF(String cpf) {
		
		if(cpf == null || !cpf.matches("(?!(\\d)\\1{10})\\d{11}")) {
			throw new IllegalArgumentException("Cpf inválido");
		}
		this.cpf = cpf;
	}

}
