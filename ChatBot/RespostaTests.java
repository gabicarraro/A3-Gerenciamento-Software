import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;

public class RespostaTests {

    @Test
    public void TestarPiada() {
        ArrayList<String> piadas = new ArrayList<>();
        piadas.add("Qual é o peixe baterista ? A truta!");
        Resposta rs5 = new RespostaAleatoria("piada", piadas);

        rs5.verifica("piada");
        assertEquals(rs5.produz(), "Qual é o peixe baterista ? A truta!");
    };

    @Test
    public void TestarPiadainputerrado() {
        ArrayList<String> piadas = new ArrayList<>();
        piadas.add("Qual é o peixe baterista ? A truta!");
        Resposta rs5 = new RespostaAleatoria("piada", piadas);

        rs5.verifica("piada");
        assertNotEquals(rs5.produz(), "batata");
    }

}
