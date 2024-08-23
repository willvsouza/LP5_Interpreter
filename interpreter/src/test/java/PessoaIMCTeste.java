import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaIMCTeste {

    @Test
    void deveCalcularIMC() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(120);
        pessoa.setAltura(1.85);

        DecimalFormat df = new DecimalFormat("#,###.00");

        assertEquals("35,06", df.format(pessoa.calcularIMC()));
    }
}