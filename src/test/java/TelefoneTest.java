import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.phelto.escola.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void naoCriarTelefoneInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone(11, 50215103322L));
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, 50215105L));
		assertThrows(IllegalArgumentException.class, () -> new Telefone(50, null));
	}
	
	@Test
	void criarTelefoneValido() {
		Integer ddd = 11;
		Long numero = 50215103L;
		
		Telefone telefone = new Telefone(ddd, numero);
		
		assertEquals(ddd, telefone.getDdd());
		assertEquals(numero, telefone.getNumero());
		
	}

}

