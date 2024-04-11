package AbstracaoPOO;
public class Mesa {
    private String tipo;
    private int capacidade;

    public Mesa(String tipo, int capacidade) {
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public void colocarObjetos() {
        System.out.println("Colocando objetos em uma mesa " + tipo + " com capacidade para " + capacidade + " pessoas.");
    }
}