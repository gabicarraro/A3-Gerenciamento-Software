import java.time.LocalDateTime;

public class RespostaHora extends Resposta {

    private String resposta_hora;

    public RespostaHora(String palavrachave){
        super(palavrachave);
        resposta_hora = "";
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
        int i_hora_hora = LocalDateTime.now().getHour();
        int i_hora_minuto = LocalDateTime.now().getMinute();
        String hora_hora = Integer.toString(i_hora_hora);
        String hora_minuto = Integer.toString(i_hora_minuto);
        //DateTimeFormatter formatter_hora = DateTimeFormatter.ofPattern("HH h mm");
        //String hora_formatada = formatter_hora.format(hora);
        resposta_hora = "Agora são " + hora_hora + "h" + hora_minuto;
        return resposta_hora;
    }

}
