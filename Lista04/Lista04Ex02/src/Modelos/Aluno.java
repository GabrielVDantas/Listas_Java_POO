package Modelos;

import java.util.Scanner;

public abstract class Aluno {
    private String ra;
    private String nome;
    private String curso;

    public Aluno(String ra, String nome, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    public Aluno() {
    }

    public abstract double calculaMedia();

    public String verificaAprovacao() {
        if (calculaMedia() >= 5) {
            return "APROVADO!";
        } else {
            return "REPROVADO!";
        }
    }

    public void pedeInfoAluno(Scanner scanner) {
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
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("HOUVE UM ERRO, O ALUNO NÃO FOI ADICIONADO!" +
                    " VERIFIQUE SE OS DADOS FORAM INSERIDOS CORRETAMENTE!");
        }
    }

    @Override
    public String toString() {
        return  "RA: " + this.getRa() +
                " NOME: " + this.getNome() +
                " CURSO: " + this.getCurso();
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

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
}

