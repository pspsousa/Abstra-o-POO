package AbstracaoPOO;
public class Relogio {
    private String marca;
    private boolean digital;

    public Relogio(String marca, boolean digital) {
        this.marca = marca;
        this.digital = digital;
    }

    public void mostrarHora() {
        System.out.println("Relógio " + marca + " - Hora atual: " + (digital ? "Digital" : "Analógico"));
    }
}