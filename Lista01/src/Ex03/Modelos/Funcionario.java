package Ex03.Modelos;

import java.util.List;
import java.util.Scanner;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    public Funcionario(int cracha, String nome, char tipoVinculo) {
        this.cracha = cracha;
        this.nome = nome;
        this.tipoVinculo = tipoVinculo;
    }

    public Funcionario() {
    }

    public float calculaSalario() {
        if (tipoVinculo == 'H') {
            float salarioApagar = (valorHora * qtdeHora) - valorDesconto;
            return salarioApagar;
        } else {
            float salarioApagar = (salario - valorDesconto);
            return salarioApagar;
        }
    }

    @Override
    public String toString() {
        String informacoes = "CRACHÁ: " + this.getCracha() +
                " NOME: " + this.getNome() +
                " TIPO DE VÍNCULO: " + this.getTipoVinculo();

        if (this.getTipoVinculo() == 'H') {
            float salario = calculaSalario();
            informacoes += " SALÁRIO A PAGAR: " + salario;
            return informacoes;
        } else {
            float salario = calculaSalario();
            informacoes += " SALÁRIO A PAGAR: " + salario;
            return informacoes;
        }
    }

    public String atualizaFuncionario(List<Funcionario> listaDeFuncionarios, int cracha, Scanner scanner) {
        for (Funcionario funcionario : listaDeFuncionarios) {
            if (funcionario.getCracha() == cracha) {
                if (funcionario.getTipoVinculo() == 'H') {
                    System.out.println("INSIRA O NOVO VALOR DA HORA: ");
                    float vHoraAltera = Float.parseFloat(scanner.nextLine());
                    funcionario.setValorHora(vHoraAltera);

                    System.out.println("INSIRA O NOVO TOTAL DE HORAS: ");
                    float qtdeHoraAltera = Float.parseFloat(scanner.nextLine());
                    funcionario.setQtdeHora(qtdeHoraAltera);
                } else {
                    System.out.println("INSIRA O NOVO VALOR DO SALÁRIO: ");
                    float salarioAltera = Float.parseFloat(scanner.nextLine());
                    funcionario.setSalario(salarioAltera);
                }

                System.out.println("INSIRA O NOVO VALOR DO DESCONTO: ");
                float descontoAlterar = Float.parseFloat(scanner.nextLine());
                funcionario.setValorDesconto(descontoAlterar);

                return "FUNCIONÁRIO ATUALIZADO!";
            }
        }
        return "FUNCIONÁRIO NÃO ENCONTRADO!";
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public int getCracha() {
        return cracha;
    }

    public String getNome() {
        return nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }
}
