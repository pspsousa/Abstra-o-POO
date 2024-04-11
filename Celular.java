package AbstracaoPOO;
public class Celular {
    private String modelo;
    private String sistemaOperacional;

    public Celular(String modelo, String sistemaOperacional) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada do celular " + modelo + " para o número " + numero);
    }
}