import java.util.Random;
import java.util.ArrayList;

public class RespostaAleatoria extends Resposta {
    ArrayList<String> respostas;
    String resposta_escolhida;

    public RespostaAleatoria(String palavrachave, ArrayList<String> respostas)
    {
        super(palavrachave);
        this.respostas = respostas;
        this.resposta_escolhida = "";
    }

    @Override
    public boolean verifica(String entrada){
        if(entrada.toLowerCase().contains(super.entrada.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String produz(){
        Random rand = new Random();
        int index_aleatorio = rand.nextInt(this.respostas.size());
        resposta_escolhida = this.respostas.get(index_aleatorio);
        return resposta_escolhida;
    }
}
