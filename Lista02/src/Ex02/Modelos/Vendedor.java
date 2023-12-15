package Ex02.Modelos;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public double calculaComissao(double valorVendaAdd) {
        return (valorVendaAdd * percentualComissao) / 100;
    }

    public double calculaComissaoTotal(double valorVendaAdd, double valorDescontoAdd) {
        return calculaComissao(valorVendaAdd) - valorDescontoAdd;
    }

    public String toString(double valorVendaAdd, double valorDescontoAdd) {
        return "CODIGO: " + this.getCodigo() +
                " NOME: " + this.getNome() +
                " VALOR A PAGAR: " + calculaComissaoTotal(valorVendaAdd, valorDescontoAdd);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

}
