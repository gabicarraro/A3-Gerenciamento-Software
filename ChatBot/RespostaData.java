import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RespostaData extends Resposta {

    private String resposta_data;

    public RespostaData(String palavrachave){
        super(palavrachave);
        resposta_data = "";
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
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatter_data = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String data_formatada = formatter_data.format(data);
        resposta_data = "Hoje é dia " + data_formatada;
        return resposta_data;
    }

}
