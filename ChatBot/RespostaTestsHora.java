import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class RespostaTestsHora {

    private RespostaHora resplist;;

    @Test
    public void TestarHora() {

        Resposta rs5 = new RespostaHora("hora");

        rs5.verifica("hora");
        assertThat(rs5.produz(), containsString("Agora são"));
    };

    @Test
    public void TestarHoradiferente() {

        Resposta rs5 = new RespostaHora("hora");

        rs5.verifica("hora");
        assertNotEquals(rs5.produz(), "horário");
    };
}