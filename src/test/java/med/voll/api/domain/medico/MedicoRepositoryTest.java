package med.voll.api.domain.medico;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest //Não substituir o banco de dados do projeto, para usar o banco que está em memoria.
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test") //Ler o arquivo application-test.properties
class MedicoRepositoryTest {

    @Test
    void escolherMedicoAleatorioLivreNaData() {

    }
}