package AbstracaoPOO;
public class Caneta {
    private String cor;
    private double espessura;

    public Caneta(String cor, double espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public void escrever(String texto) {
        System.out.println("Escrevendo em " + cor + " com espessura " + espessura + ": " + texto);
    }
}