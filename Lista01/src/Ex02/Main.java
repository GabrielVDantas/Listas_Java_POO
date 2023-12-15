package Ex02;

import Ex02.Modelos.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Aluno> listaDeAlunos = new ArrayList<>();

        String menu =
                """
                    DIGITE UMA DAS OPÇÕES:
                    1 - ADICIONAR ALUNO
                    2 - MOSTRAR ALUNO
                    3 - SAIR
                        """;

        int escolha;

        do {
            System.out.println(menu);
            escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    System.out.println("INSIRA O RA: ");
                    String raAdd = scanner.nextLine();

                    System.out.println("INSIRA O NOME: ");
                    String nomeAdd = scanner.nextLine();

                    System.out.println("INSIRA A NOTA DA AC1: ");
                    int ac1Add = Integer.parseInt(scanner.nextLine());

                    System.out.println("INSIRA A NOTA DA AC2: ");
                    int ac2Add = Integer.parseInt(scanner.nextLine());

                    System.out.println("INSIRA A NOTA DA AG: ");
                    int agAdd = Integer.parseInt(scanner.nextLine());

                    System.out.println("INSIRA A NOTA DA AF: ");
                    int afAdd = Integer.parseInt(scanner.nextLine());

                    Aluno novoAluno = new Aluno(raAdd, nomeAdd, ac1Add, ac2Add, agAdd, afAdd);

                    listaDeAlunos.add(novoAluno);
                    break;
                case 2:
                    System.out.println("INSIRA O RA: ");
                    String raRemove = scanner.nextLine();

                    for (Aluno aluno: listaDeAlunos) {
                        if (aluno.getRa().equals(raRemove)) {
                            System.out.println(aluno.toString());
                            break;
                        }
                        System.out.println("O ALUNO EM QUESTÃO NÃO FOI ENCONTRADO!");
                    }
                    break;
                case 3:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("VOCÊ DIGITOU UMA OPÇÃO QUE NÃO ESTÁ ENTRE AS DISPONÍVEIS!" +
                            "TENTE NOVAMENTE!");
                    break;
            }
        } while (escolha != 3);
    }
}
