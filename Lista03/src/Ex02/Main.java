package Ex02;

import Ex02.Modelos.Automovel;
import Ex02.Modelos.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> listaDePessoas = new ArrayList<>();

        String menu =
                """
                    ESCOLHA UMA DAS OPÇÕES:
                    1 - ADICIONAR PESSOA
                    2 - ADICIONAR AUTOMÓVEL
                    3 - TRANSFERIR AUTOMÓVEL
                    4 - MOSTRAR TODAS AS PESSOAS
                    5 - MOSTRAR OS AUTOMÓVEIS DE DETERMINADA PESSOA
                    6 - SAIR
                        """;

        int escolha;

        do {
            System.out.println(menu);
            escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    System.out.println("INSIRA O CÓDIGO: ");
                    int codigoAdd = Integer.parseInt(scanner.nextLine());

                    System.out.println("INSIRA O NOME: ");
                    String nomeAdd = scanner.nextLine();

                    Pessoa novaPessoa = new Pessoa(codigoAdd, nomeAdd);
                    listaDePessoas.add(novaPessoa);
                    System.out.println("PESSOA ADICIONADA!");
                    break;
                case 2:
                    System.out.println("INSIRA A MARCA: ");
                    String marcaAdd = scanner.nextLine();

                    System.out.println("INSIRA O MODELO: ");
                    String modeloAdd = scanner.nextLine();

                    Automovel novoAutomovel = new Automovel(marcaAdd, modeloAdd);

                    System.out.println("INSIRA O CÓDIGO DO DONO DO AUTOMÓVEL: ");
                    int codigoDonoAuto = Integer.parseInt(scanner.nextLine());

                    Pessoa pessoa = null;
                    for (Pessoa p : listaDePessoas) {
                        if (p.getCodigo() == codigoDonoAuto) {
                            pessoa = p;
                            break;
                        }
                    }
                    pessoa.insereAutomovel(novoAutomovel, codigoDonoAuto, listaDePessoas);
                    break;
                case 3:
                    System.out.println("INSIRA A MARCA: ");
                    String marcaTransf = scanner.nextLine();

                    System.out.println("INSIRA O MODELO: ");
                    String modeloTransf = scanner.nextLine();

                    Automovel automovel = new Automovel(marcaTransf, modeloTransf);

                    System.out.println("INSIRA O CÓDIGO DO ANTIGO DONO DO AUTOMÓVEL: ");
                    int codigoAntigoDonoAuto = Integer.parseInt(scanner.nextLine());

                    System.out.println("INSIRA O CÓDIGO DO NOVO DONO DO AUTOMÓVEL: ");
                    int codigoNovoDonoAuto = Integer.parseInt(scanner.nextLine());

                    Pessoa antigoDono = null;
                    Pessoa novoDono = null;

                    for (Pessoa p : listaDePessoas) {
                        if (p.getCodigo() == codigoAntigoDonoAuto) {
                            antigoDono = p;
                        } else if (p.getCodigo() == codigoNovoDonoAuto) {
                            novoDono = p;
                        } else if (antigoDono != null && novoDono != null) {
                            System.out.println("PESSOAS NÃO ENCONTRADAS!");
                        }
                    }
                    antigoDono.removeAutomovel(antigoDono, codigoAntigoDonoAuto, marcaTransf, modeloTransf);
                    novoDono.insereAutomovel(automovel, codigoNovoDonoAuto, listaDePessoas);
                    break;
                case 4:
                    for (Pessoa pessoa1: listaDePessoas) {
                        System.out.println(pessoa1.toString());
                    }
                    break;
                case 5:
                    Pessoa detPessoa = new Pessoa();

                    System.out.println("INSIRA O CÓDIGO DE DETERMINADA PESSOA: ");
                    int codigoDetPessoa = Integer.parseInt(scanner.nextLine());
                    detPessoa.setCodigo(codigoDetPessoa);

                    detPessoa.toStringCompleto(codigoDetPessoa, listaDePessoas);
                    break;
                case 6:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("VOCÊ DIGITOU UMA OPÇÃO QUE NÃO ESTÁ ENTRE AS DISPONÍVEIS!" +
                            "TENTE NOVAMENTE!");
                    break;
            }
        } while (escolha != 6);
    }
}




