package Ex01.Modelos;

public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    @Override
    public String toString() {
        return "NÚMERO: " + this.getNumero() +
                " NOME: " + this.getNome() +
                " IDADE: " + this.getIdade() +
                " SEXO: " + this.getSexo() +
                " VALOR DO AUTOMÓVEL: " + this.getValorAutomovel() +
                " VALOR DA APÓLICE: " + calculaValor();
    }

    public double calculaValor() {
        double valorApagar = 0;
        if (sexo == 'M' && idade <= 25) {
            valorApagar = valorAutomovel * 0.10;
            return valorApagar;
        } else if (sexo == 'M' && idade > 25) {
            valorApagar = valorAutomovel * 0.05;
            return valorApagar;
        } else {
            valorApagar = valorAutomovel * 0.02;
            return valorApagar;
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }
}
