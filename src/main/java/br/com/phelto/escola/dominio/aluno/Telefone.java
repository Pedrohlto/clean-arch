package br.com.phelto.escola.dominio.aluno;
import lombok.Getter;

@Getter
public class Telefone {

	private Integer ddd;
	private Long numero;
	
	public Telefone(Integer ddd, Long numero) {
		
		if(ddd == null || ddd.toString().length() != 2 ) throw new IllegalArgumentException("DDD inválido");
		
		if(numero == null || numero.toString().length() < 8 || numero.toString().length() > 9) throw new IllegalArgumentException("Numero inválido");
		
		this.ddd = ddd;
		this.numero = numero;
	}
	
	
}
