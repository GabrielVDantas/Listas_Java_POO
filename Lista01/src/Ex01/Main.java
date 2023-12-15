package Ex01;

import Ex01.Modelos.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> listaDePessoas = new ArrayList<>();

        String menu =
                """
                    DIGITE UMA DAS OPÇÕES:
                    1 - ADICIONAR PESSOA
                    2 - REMOVER PESSOA
                    3 - SAIR
                        """;

        int escolha;

        do {
            System.out.println(menu);
            escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    System.out.println("INSIRA O CPF: ");
                    String cpfAdd = scanner.nextLine();

                    System.out.println("INSIRA O NOME: ");
                    String nomeAdd = scanner.nextLine();

                    System.out.println("INSIRA O SEXO: ");
                    char sexoAdd = scanner.nextLine().charAt(0);

                    System.out.println("INSIRA A IDADE: ");
                    int idadeAdd = Integer.parseInt(scanner.nextLine());


                    Pessoa novaPessoa = new Pessoa(cpfAdd, nomeAdd, sexoAdd, idadeAdd);

                    listaDePessoas.add(novaPessoa);
                    break;
                case 2:
                    System.out.println("INSIRA O CPF: ");
                    String cpfRemove = scanner.nextLine();

                    for (Pessoa pessoa: listaDePessoas) {
                        if (pessoa.getCpf().equals(cpfRemove)) {
                            listaDePessoas.remove(pessoa);
                            System.out.println("PESSOA REMOVIDA!");
                            break;
                        }
                        System.out.println("A PESSOA EM QUESTÃO NÃO FOI ENCONTRADA!");
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
