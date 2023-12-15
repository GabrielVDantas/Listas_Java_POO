package Main;


import Modelos.Aluno;
import Modelos.AlunoGraduacao;
import Modelos.AlunoPosGraduacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Aluno> lisaDeAlunos = new ArrayList<>();

        String menu = """
                O QUE DESEJA FAZER?
                1 - INSERIR ALUNOS
                2 - EXIBIR ALUNOS
                3 - SAIR
                """;
        int escolha;

        do {
            System.out.println(menu);
            escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    Aluno novoAluno = null;

                    try {
                        System.out.println("É UM ALUNO DA GRADUAÇÃO OU PÓS GRADUAÇÃO? " +
                                "(1 - GRADUAÇÃO 2 - PÓS GRADUAÇÃO)");
                        int condicao = Integer.parseInt(scanner.nextLine());

                        if (condicao == 1) {
                            novoAluno = new AlunoGraduacao();

                            novoAluno.pedeInfo(scanner);

                        } else if (condicao == 2) {
                            novoAluno = new AlunoPosGraduacao();

                            novoAluno.pedeInfo(scanner);

                        }
                        lisaDeAlunos.add(novoAluno);
                    } catch (NumberFormatException | NullPointerException e) {
                        System.out.println("VOCÊ DIGITOU ALGO QUE NÃO CORRESPONDE COM A PERGUNTA");
                    }
                    break;
                case 2:
                    for (Aluno aluno: lisaDeAlunos) {
                        System.out.println(aluno.toString());
                    }
                    break;
                case 3:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("VOCÊ DIGITOU UM NÚMERO QUE NÃO EXISTE!" +
                            " TENTE NOVAMENTE!");
            }
        } while (escolha != 3);
    }

}

