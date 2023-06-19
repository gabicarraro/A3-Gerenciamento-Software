public class RespostaSimples extends Resposta {
    private String resposta_simples;

    public RespostaSimples(String palavrachave, String resposta){
        super(palavrachave);
        this.resposta_simples = resposta;
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
        return resposta_simples;
    }

}
