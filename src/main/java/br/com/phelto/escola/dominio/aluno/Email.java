package br.com.phelto.escola.dominio.aluno;
import lombok.Getter;

@Getter
public class Email {
	
	public Email (String endereco) {
		
		if (endereco == null || !endereco.matches("^([\\w\\.\\-]+)@([\\w\\-]+)((\\.(\\w){2,3})+)$") ) {
		
			throw new IllegalArgumentException("Email inválido");
		}
		
		this.endereco = endereco;
		
	}
	
	private String endereco;

}
