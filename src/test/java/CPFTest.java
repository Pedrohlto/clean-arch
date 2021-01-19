import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.phelto.escola.dominio.aluno.CPF;

class CPFTest {

	@Test
	void naoCriarCpfInvalido() {
		
		assertThrows(IllegalArgumentException.class,() -> new CPF("4040412"));
		assertThrows(IllegalArgumentException.class,() -> new CPF(""));
		assertThrows(IllegalArgumentException.class,() -> new CPF(null));
		assertThrows(IllegalArgumentException.class,() -> new CPF("00000000000"));
	}
	
	@Test
	void criarCpfvalido() {
		
		String numeroCpf = "27503222000";
		CPF cpf = new CPF(numeroCpf);		
		assertEquals(cpf.getCpf(), numeroCpf);		
	}

}
