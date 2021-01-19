package br.com.phelto.escola.dominio.indicacao;
import java.time.LocalDateTime;

import br.com.phelto.escola.dominio.aluno.Aluno;
import lombok.Getter;

@Getter
public class Indicacao {

	private Aluno indicado;
	private Aluno indicante;
	private LocalDateTime dataIndicacao;
	
	public Indicacao(Aluno indicado, Aluno indicante) {
		super();
		this.indicado = indicado;
		this.indicante = indicante;
		this.dataIndicacao = LocalDateTime.now();
	}
	
	
}

