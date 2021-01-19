package br.com.phelto.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.phelto.escola.dominio.aluno.Aluno;
import br.com.phelto.escola.dominio.aluno.CPF;
import br.com.phelto.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.phelto.escola.infra.aluno.RepositorioAlunosMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveSerMatriculado() {
		RepositorioDeAlunos repositorio = new RepositorioAlunosMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		
		MatricularAlunoDto dto = new MatricularAlunoDto("Pedro", "15144340083", "pedro.oliveira@blablalba.com.br");
		useCase.matricular(dto);
		
		Aluno alunoEncontrado = repositorio.buscarPorCpf(new CPF("15144340083"));
		
		assertEquals(alunoEncontrado.getNome(), "Pedro");
		
	}

}
