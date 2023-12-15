package Ex02.Modelos;

public class Automovel {
    private String marca;
    private String modelo;

    public Automovel(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "MARCA: " + this.getMarca() +
                " MODELO: " + this.getModelo();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


}
