package Modelos;

import java.util.Scanner;

public class Atendente extends Funcionario {
    private String setor;
    private String funcao;

    public Atendente(String nome, String cpf, int nCracha, double salario, String setor, String funcao) {
        super(nome, cpf, nCracha, salario);
        this.setor = setor;
        this.funcao = funcao;
    }

    public Atendente() {
    }

    public void pedeInfoDoAtendente(Scanner scanner) {
        try {
            System.out.println("INSIRA O SETOR: ");
            String setorAtendente = scanner.nextLine();
            setSetor(setorAtendente);

            System.out.println("INSIRA A FUNÇÃO: ");
            String funcaoAtendente = scanner.nextLine();
            setFuncao(funcaoAtendente);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("VOCÊ DIGITOU ALGO QUE NÃO CORRESPONDE COM A PERGUNTA");
        }
    }

    @Override
    public String toString() {
        String infoAtendente = "\nSETOR: " + this.getSetor() +
                " FUNÇÃO: " + this.getFuncao();
        return super.toString() + infoAtendente;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public String getFuncao() {
        return funcao;
    }
}
