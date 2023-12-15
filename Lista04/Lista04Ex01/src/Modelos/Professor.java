package Modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Funcionario{
    private String urlLattes;
    private List<Disciplina> disciplinasDoProfessor;

    public Professor(String nome, String cpf, int nCracha, double salario,
                     String urlLattes) {
        super(nome, cpf, nCracha, salario);
        this.urlLattes = urlLattes;
        this.disciplinasDoProfessor = new ArrayList<>();
    }

    public Professor() {
        this.disciplinasDoProfessor = new ArrayList<>();
    }

    public void pedeInfoDoProfessor(Scanner scanner) {
        try {
            System.out.println("INSIRA A URL DO CURRÍCULO LATTES: ");
            String urlLattesProfessor = scanner.nextLine();
            setUrlLattes(urlLattesProfessor);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("VOCÊ DIGITOU ALGO QUE NÃO CORRESPONDE COM A PERGUNTA");
        }

    }

    public void insereDisciplina(Scanner scanner,
                                 List<Pessoa> listaDePessoas, List<Disciplina> todasAsDisciplinas) {
        System.out.println("INSIRA O CRACHÁ DO PROFESSOR: ");
        int crachaProfAddDisciplina = Integer.parseInt(scanner.nextLine());

        for (Pessoa pessoa: listaDePessoas) {
            if (pessoa instanceof Professor professor) {
                if (professor.getnCracha() == crachaProfAddDisciplina) {
                    System.out.println("INSIRA O CÓDIGO DA DISCIPLINA: ");
                    int codigoDisciplinaAddProf= Integer.parseInt(scanner.nextLine());

                    for (Disciplina disciplina: todasAsDisciplinas) {
                        if (disciplina.getCodigo() == codigoDisciplinaAddProf) {
                            disciplinasDoProfessor.add(disciplina);
                        }
                    }
                }
            }
        }
    }

    public void adicionaDisciplina(Scanner scanner, List<Disciplina> todasAsDisciplinas) {

        boolean disciplinaFoiEncontrada = false;

        System.out.println("INSIRA O CÓDIGO DA DISCIPLINA: ");
        int codigoDisciplina = Integer.parseInt(scanner.nextLine());

        for (Disciplina disciplina: todasAsDisciplinas) {
            if (disciplina.getCodigo() == codigoDisciplina) {
                disciplinasDoProfessor.add(disciplina);
                disciplinaFoiEncontrada = true;
                break;
            }
        }
        if (!disciplinaFoiEncontrada) {
            System.out.println("DISCIPLINA NÃO ENCONTRADA!");
        }
    }


    @Override
    public String toString() {
        String infoProfessor = "\nURL DO CURRÍCULO LATTES: " + this.getUrlLattes() +
                " DISCIPLINAS: " + disciplinasDoProfessor;
        return super.toString() + infoProfessor;
    }

    public void setUrlLattes(String urlLattes) {
        this.urlLattes = urlLattes;
    }

    public void setDisciplinasDoProfessor(List<Disciplina> disciplinasDoProfessor) {
        this.disciplinasDoProfessor = disciplinasDoProfessor;
    }

    public String getUrlLattes() {
        return urlLattes;
    }

    public List<Disciplina> getDisciplinasDoProfessor() {
        return disciplinasDoProfessor;
    }
}
