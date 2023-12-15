package Modelos;

import java.util.Scanner;

public class AlunoPosGraduacao implements Aluno {
    private String ra;
    private String nome;
    private String curso;
    private String anoConclusaoPos;
    private double n1;
    private double n2;

    public AlunoPosGraduacao(String ra, String nome, String curso,
                             String anoConclusaoPos, double n1, double n2) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.anoConclusaoPos = anoConclusaoPos;
        this.n1 = n1;
        this.n2 = n2;
    }

    public AlunoPosGraduacao() {
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
        return (n1 + n2) / 2;
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
        String infoAlunoPos = "RA: " + this.getRa() +
                " NOME: " + this.getNome() + " CURSO: " + this.getCurso() +
                " ANO DE CONCLUSÃO: " + this.getAnoConclusaoPos() +
                " SITUAÇÃO: " + verificaAprovacao();
        return infoAlunoPos;
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

    public String getAnoConclusaoPos() {
        return anoConclusaoPos;
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



