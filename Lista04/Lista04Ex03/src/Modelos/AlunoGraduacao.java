package Modelos;

import java.util.Scanner;

public class AlunoGraduacao implements Aluno {
    private String ra;
    private String nome;
    private String curso;
    private String anoConclusaoGraduacao;
    private double ac1;
    private double ac2;
    private double af;
    private double ag;

    public AlunoGraduacao(String ra, String nome, String curso,
                          String anoConclusaoGraduacao, double ac1, double ac2, double af, double ag) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
        this.ac1 = ac1;
        this.ac2 = ac2;
        this.af = af;
        this.ag = ag;
    }

    public AlunoGraduacao() {
    }

    @Override
    public void pedeInfo(Scanner scanner) {
        try {
            System.out.println("INSIRA O RA: ");
            String raAluno = scanner.nextLine();
            setRa(raAluno);

            System.out.println("INSIRA O NOME: ");
            String nomeAluno = scanner.nextLine();
            setNome(nomeAluno);

            System.out.println("INSIRA O CURSO: ");
            String cursoAluno = scanner.nextLine();
            setCurso(cursoAluno);

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
    public double calculaMedia() {
        return  (ac1 * 0.1) + (ac2 * 0.3) + (ag * 0.2) + (af * 0.4);
    }

    @Override
    public String verificaAprovacao() {
        if (calculaMedia() > 5) {
            return "APROVADO!";
        } else {
            return "REPROVADO!";
        }
    }

    @Override
    public String toString() {
        String infoAlunoGraduacao = "RA: " + this.getRa() +
                " NOME: " + this.getNome() + " CURSO: " + this.getCurso() +
                " ANO DE CONCLUSÃO: " + this.getAnoConclusaoGraduacao() + " SITUAÇÃO: " + verificaAprovacao();
        return infoAlunoGraduacao;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

