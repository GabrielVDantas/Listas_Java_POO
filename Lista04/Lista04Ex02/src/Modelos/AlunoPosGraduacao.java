package Modelos;

import java.util.Scanner;

public class AlunoPosGraduacao extends Aluno {
    private String anoConclusaoPos;
    private double n1;
    private double n2;

    public AlunoPosGraduacao(String ra, String nome, String curso,
                             String anoConclusaPos, double n1, double n2) {
        super(ra, nome, curso);
        this.anoConclusaoPos = anoConclusaoPos;
        this.n1 = n1;
        this.n2 = n2;
    }

    public AlunoPosGraduacao() {
    }

    public void pedeInfoPosGraduacao(Scanner scanner) {
        try {
            System.out.println("INSIRA O ANO DE CONCLUSÃO DA PÓS: ");
            String conclusaoPos = scanner.nextLine();
            setAnoConclusaoPos(conclusaoPos);

            System.out.println("INSIRA A NOTA DA PROVA 1: ");
            int n1Pos = Integer.parseInt(scanner.nextLine());
            setN1(n1Pos);

            System.out.println("INSIRA A NOTA DA PROVA 2: ");
            int n2Pos = Integer.parseInt(scanner.nextLine());
            setN2(n2Pos);

        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("HOUVE UM ERRO, O ALUNO NÃO FOI ADICIONADO!" +
                    " VERIFIQUE SE OS DADOS FORAM INSERIDOS CORRETAMENTE!");
        }
    }

    @Override
    public double calculaMedia() {
        double resultado = (n1 + n2) / 2;

        return resultado;
    }

    @Override
    public String toString() {
        String infoAlunoPos = " ANO DE CONCLUSÃO: " + this.getAnoConclusaoPos() +
                " SITUAÇÃO: " + verificaAprovacao();
        return super.toString() + infoAlunoPos;
    }

    public String getAnoConclusaoPos() {
        return anoConclusaoPos;
    }

    public void setAnoConclusaoPos(String anoConclusaoPos) {
        this.anoConclusaoPos = anoConclusaoPos;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
}

