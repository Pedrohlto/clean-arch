package br.com.phelto.escola.infra.aluno;

import java.util.List;

import br.com.phelto.escola.dominio.aluno.Aluno;
import br.com.phelto.escola.dominio.aluno.CPF;
import br.com.phelto.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioAlunosJDBC implements RepositorioDeAlunos {

	@Override
	public void matricular(Aluno aluno) {
	}

	@Override
	public Aluno buscarPorCpf(CPF cpf) {
		return null;
	}

	@Override
	public List<Aluno> listarAlunosMatriculados() {
		return null;
	}

}
