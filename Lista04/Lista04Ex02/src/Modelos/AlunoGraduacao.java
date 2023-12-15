package Modelos;

import java.util.Scanner;

public class AlunoGraduacao extends Aluno {
    private String anoConclusaoGraduacao;
    private double ac1;
    private double ac2;
    private double af;
    private double ag;

    public AlunoGraduacao(String ra, String nome, String curso,
                          String anoConclusaoGraduacao, double ac1, double ac2, double af, double ag) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
        this.ac1 = ac1;
        this.ac2 = ac2;
        this.af = af;
        this.ag = ag;
    }

    public AlunoGraduacao() {
    }

    @Override
    public double calculaMedia() {
        double resultado = (ac1 * 0.1) + (ac2 * 0.3) + (ag * 0.2) + (af * 0.4);

        return resultado;
    }

    public void pedeInfoGraduacao(Scanner scanner) {
        try {
            System.out.println("INSIRA O ANO DE CONCLUSÃO DA GRADUAÇÃO: ");
            String conclusaoGraduacao = scanner.nextLine();
            setAnoConclusaoGraduacao(conclusaoGraduacao);

            System.out.println("INSIRA A NOTA DA AC1: ");
            double ac1Graduacao = Double.parseDouble(scanner.nextLine());
            setAc1(ac1Graduacao);

            System.out.println("INSIRA A NOTA DA AC2: ");
            double ac2Graduacao = Double.parseDouble(scanner.nextLine());
            setAc2(ac2Graduacao);

            System.out.println("INSIRA A NOTA DA AF: ");
            double afGraduacao = Double.parseDouble(scanner.nextLine());
            setAf(afGraduacao);

            System.out.println("INSIRA A NOTA DA AG: ");
            double agGraduacao = Double.parseDouble(scanner.nextLine());
            setAg(agGraduacao);


        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("HOUVE UM ERRO, O ALUNO NÃO FOI ADICIONADO!" +
                    " VERIFIQUE SE OS DADOS FORAM INSERIDOS CORRETAMENTE!");
        }
    }

    @Override
    public String toString() {
        String infoAlunoGraduacao = " ANO DE CONCLUSÃO: " + this.getAnoConclusaoGraduacao() +
                " SITUAÇÃO: " + verificaAprovacao();
        return super.toString() + infoAlunoGraduacao;
    }

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    public void setAc1(double ac1) {
        this.ac1 = ac1;
    }

    public void setAc2(double ac2) {
        this.ac2 = ac2;
    }

    public void setAf(double af) {
        this.af = af;
    }

    public void setAg(double ag) {
        this.ag = ag;
    }
}

