package br.com.phelto.escola.infra.aluno;

import br.com.phelto.escola.dominio.aluno.CifradorSenha;

public class CifradorSenhaImpl implements CifradorSenha{

	@Override
	public String cifrarSenha(String senha) {
		return "senha";
	}

	@Override
	public boolean validarSenhaCifrada(String senhaCifrada, String senha) {
		return false;
	}
	
	

}
