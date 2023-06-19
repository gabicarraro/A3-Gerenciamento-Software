public class RespostaContador extends Resposta {
    private String resposta_cont;
    private int contador;

    public RespostaContador(String palavrachave){
        super(palavrachave);
        resposta_cont = "";
        contador = 0;
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
        contador++;
        resposta_cont = "Ok! A conta atualmente está em " + Integer.toString(contador);
        return resposta_cont;
    }
}
