package br.com.phelto.escola.aplicacao.aluno.matricular;

import br.com.phelto.escola.dominio.aluno.Aluno;
import br.com.phelto.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

	private final RepositorioDeAlunos repositorioAlunos;

	public MatricularAluno(RepositorioDeAlunos repositorioAlunos) {
		this.repositorioAlunos = repositorioAlunos;
	}
	
	public void matricular (MatricularAlunoDto dto) {
		
		Aluno aluno = dto.criarAluno();
		
		repositorioAlunos.matricular(aluno);
		
	}
	
	
}
