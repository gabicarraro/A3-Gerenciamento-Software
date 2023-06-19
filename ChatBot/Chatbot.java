import java.util.ArrayList;

public class Chatbot {
    private ArrayList<Resposta> resplist;

    public Chatbot() {
        resplist = new ArrayList<Resposta>();
    }

    public void adiciona(Resposta resp) {
        resplist.add(resp);
    }

    public void processar(String palavrachave) {
        for (int i = 0; i < resplist.size(); i++) {
            Resposta c = resplist.get(i);
            if (c.verifica(palavrachave)) {
                System.out.println(c.produz());
            }
        }
    }
}
