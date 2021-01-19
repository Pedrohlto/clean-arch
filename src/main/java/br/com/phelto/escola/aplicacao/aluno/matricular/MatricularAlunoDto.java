package br.com.phelto.escola.aplicacao.aluno.matricular;

import br.com.phelto.escola.dominio.aluno.Aluno;
import br.com.phelto.escola.dominio.aluno.FabricaDeAluno;
import lombok.Getter;

@Getter
public class MatricularAlunoDto {
	
	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;
	
	public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
		super();
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}
	
	public Aluno criarAluno() {
		
		return new FabricaDeAluno().comNomeCPFEmail(nomeAluno, cpfAluno, emailAluno).criar();
		
	}
	
	
	

}
