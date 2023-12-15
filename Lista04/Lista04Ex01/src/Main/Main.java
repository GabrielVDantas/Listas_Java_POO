package Main;

import Modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> listaDePessoas = new ArrayList<>();
        List<Disciplina> todasAsDisciplinas = new ArrayList<>();

        String menu = """
                O QUE DESEJA FAZER?
                1 - INSERIR DISCIPLINA
                2 - INSERIR PROFESSOR
                3 - INSERIR ATENDENTE
                4 - INSERIR ALUNO
                5 - ADICIONAR DISCIPLINA A UM PROFESSOR
                6 - MOSTRAR TODAS AS PESSOAS
                7 - SAIR
                """;
        int escolha;

        do {
            System.out.println(menu);
            escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    Disciplina novaDisciplina = new Disciplina();

                    novaDisciplina.pedeInfoDaDisciplina(scanner);

                    todasAsDisciplinas.add(novaDisciplina);
                    break;
                case 2:
                    Professor novoProfessor = new Professor();

                    novoProfessor.pedeInfoDaPessoa(scanner);
                    novoProfessor.pedeInfoDoFuncionario(scanner);
                    novoProfessor.pedeInfoDoProfessor(scanner);

                    listaDePessoas.add(novoProfessor);
                    break;
                case 3:
                    Atendente novoAtendente = new Atendente();

                    novoAtendente.pedeInfoDaPessoa(scanner);
                    novoAtendente.pedeInfoDoFuncionario(scanner);
                    novoAtendente.pedeInfoDoAtendente(scanner);

                    listaDePessoas.add(novoAtendente);
                    break;
                case 4:
                    Aluno novoAluno = new Aluno();

                    novoAluno.pedeInfoDaPessoa(scanner);
                    novoAluno.pedeInfoDoAluno(scanner);

                    listaDePessoas.add(novoAluno);
                    break;
                case 5:
                    System.out.println("INSIRA O CRACHÁ DO PROFESSOR: ");
                    int crachaProfessor = Integer.parseInt(scanner.nextLine());

                    boolean professorFoiEncontrado = false;

                    for (Pessoa pessoa: listaDePessoas) {
                        if (pessoa instanceof Professor professor) {
                            if (professor.getnCracha() == crachaProfessor) {
                                professorFoiEncontrado = true;
                                professor.adicionaDisciplina(scanner, todasAsDisciplinas);
                                break;
                            }
                        }
                    }
                    if (!professorFoiEncontrado) {
                        System.out.println("PROFESSOR NÃO ENCONTRADO!");
                    }
                    break;
                case 6:
                    for (Pessoa pessoa: listaDePessoas) {
                        System.out.println(pessoa.toString());
                    }
                    break;
                case 7:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("VOCÊ DIGITOU UMA OPÇÃO QUE NÃO ESTÁ ENTRE AS DISPONÍVEIS!" +
                            " TENTE NOVAMENTE!");
                    break;
            }
        } while (escolha != 7);
    }
}
