public abstract class Resposta {
    public String entrada;

    public Resposta(String palavrachave) {
        this.entrada = palavrachave;
    }

    public abstract boolean verifica(String entrada);

    public abstract String produz();

}
