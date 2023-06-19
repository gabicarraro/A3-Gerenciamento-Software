import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chatbot bot = new Chatbot();
        // criando as respostas
        Resposta rs1 = new RespostaSimples("nome", "Meus amigos me chamam de AnhembiBot.");
        Resposta rs2 = new RespostaData("dia");
        // adicionando as respostas ao chatbot
        bot.adiciona(rs1);
        bot.adiciona(rs2);
        System.out.println(" ------------------------------------");
        System.out.println(" Iniciando o chatbot ");
        System.out.println(" ------------------------------------");
        Scanner entrada = new Scanner(System.in);
        String texto;
        // loop infinito para ficar lendo as perguntas do usuario
        while (true) {
            System.out.print("> ");
            texto = entrada.nextLine();
            bot.processar(texto);
        }
    }
}
