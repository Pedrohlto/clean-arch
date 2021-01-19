import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.phelto.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoCriarEmailComEnderecoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email("qualquer coisa"));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
	}
	
	@Test
	void criarEmailComEnderecoValido() {
		String enderecoEmail = "pedro_hlto@hotmail.com";
		Email email = new Email (enderecoEmail);		
		assertEquals(enderecoEmail, email.getEndereco());
	}

}

