package Modelos;

import java.util.Scanner;

public class Aluno extends Pessoa {
    private String ra;
    private String curso;

    public Aluno(String nome, String cpf, String ra, String curso) {
        super(nome, cpf);
        this.ra = ra;
        this.curso = curso;
    }

    public Aluno() {
    }

    public void pedeInfoDoAluno(Scanner scanner) {
        try {
            System.out.println("INSIRA O RA: ");
            String raAluno = scanner.nextLine();
            setRa(raAluno);

            System.out.println("INSIRA O CURSO: ");
            String cursoAluno = scanner.nextLine();
            setCurso(cursoAluno);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("VOCÊ DIGITOU ALGO QUE NÃO CORRESPONDE COM A PERGUNTA");
        }
    }

    @Override
    public String toString() {
        String infoAluno = "\nRA: " + this.getRa() +
                " CURSO: " + this.getCurso();
        return super.toString() + infoAluno;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public String getCurso() {
        return curso;
    }
}
