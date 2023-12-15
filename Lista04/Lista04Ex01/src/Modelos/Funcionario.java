package Modelos;

import java.util.Scanner;

public class Funcionario extends Pessoa{
    private int nCracha;
    private double salario;

    public Funcionario(String nome, String cpf, int nCracha, double salario) {
        super(nome, cpf);
        this.nCracha = nCracha;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public void pedeInfoDoFuncionario(Scanner scanner) {
        try {
            System.out.println("INSIRA O NÚMERO DO CRACHÁ: ");
            int crachaFuncionario = Integer.parseInt(scanner.nextLine());
            setnCracha(crachaFuncionario);

            System.out.println("INSIRA O SALÁRIO: ");
            double salarioFuncionario = Double.parseDouble(scanner.nextLine());
            setSalario(salarioFuncionario);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("VOCÊ DIGITOU ALGO QUE NÃO CORRESPONDE COM A PERGUNTA");
        }
    }

    public String toString() {
        String infoFuncionario = "\nCRACHÁ: " + this.getnCracha() +
                "SALÁRIO: " + this.getSalario();
        return super.toString() + infoFuncionario;
    }

    public void setnCracha(int nCracha) {
        this.nCracha = nCracha;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getnCracha() {
        return nCracha;
    }

    public double getSalario() {
        return salario;
    }
}
