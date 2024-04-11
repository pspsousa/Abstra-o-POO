package AbstracaoPOO;
public class Computador {
    private String tipo;
    private String sistemaOperacional;

    public Computador(String tipo, String sistemaOperacional) {
        this.tipo = tipo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ligar() {
        System.out.println("Ligando o computador " + tipo + " com sistema operacional " + sistemaOperacional);
    }
}