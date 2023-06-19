import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class RespostaTestData {

    private RespostaData resplist;;

    @Test
    public void TestarData() {

        Resposta rs5 = new RespostaData("dia");

        rs5.verifica("dia");
        assertThat(rs5.produz(), containsString("Hoje é dia"));
    };

    @Test
    public void TestarDatadiferente() {

        Resposta rs5 = new RespostaData("dia");

        rs5.verifica("dia");
        assertNotEquals(rs5.produz(), "amanhã");
    };
}
