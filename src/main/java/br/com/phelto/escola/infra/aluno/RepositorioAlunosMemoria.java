package br.com.phelto.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.phelto.escola.dominio.aluno.Aluno;
import br.com.phelto.escola.dominio.aluno.CPF;
import br.com.phelto.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioAlunosMemoria implements RepositorioDeAlunos{

	private List<Aluno> matriculados = new ArrayList<>(); 

	@Override
	public void matricular(Aluno aluno) {
		
		this.matriculados.add(aluno);
		
	}

	@Override
	public Aluno buscarPorCpf(CPF cpf) {
		return this.matriculados.stream()
				                .filter(a -> a.getCpf().equals(cpf.getCpf()))
				                .findFirst()
				                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
	}

	@Override
	public List<Aluno> listarAlunosMatriculados() {
		return this.matriculados;
	}

}
