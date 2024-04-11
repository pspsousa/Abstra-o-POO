package AbstracaoPOO;
public class Cadeira {
    private String material;
    private int quantidadePernas;

    public Cadeira(String material, int quantidadePernas) {
        this.material = material;
        this.quantidadePernas = quantidadePernas;
    }

    public void sentar() {
        System.out.println("Sentando em uma cadeira de " + material + " com " + quantidadePernas + " pernas.");
    }
}