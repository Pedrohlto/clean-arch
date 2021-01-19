package br.com.phelto.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;


public class Aluno {
	
	private CPF cpf;
	private String nome;
	private Email email;
	private String senha;
	
	List<Telefone> telefones = new ArrayList<>();
    
	public Aluno(CPF cpf, String nome, Email email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
    
    public void adicionarTelefone(Integer ddd, Long numero) {
    	this.telefones.add(new Telefone(ddd,numero));
    }

	public String getCpf() {
		return cpf.getCpf();
	}

	public String getNome() {
		return nome;
	}

	
	public String getEmail() {
		return email.getEndereco();
	}

	
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}   
	
}
