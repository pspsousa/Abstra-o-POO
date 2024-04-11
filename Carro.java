package AbstracaoPOO;
public class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("Acelerando o carro " + marca + " " + modelo);
    }
}