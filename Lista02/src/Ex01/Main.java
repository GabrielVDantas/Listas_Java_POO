package Ex01;

import Ex01.Modelos.Apolice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Apolice> listaDeApolices = new ArrayList<>();

        String menu =
                """
                    DIGITE UMA DAS OPÇÕES:
                    1 - CRIAR APÓLICE
                    2 - VER DADOS DA APÓLICE
                    3 - SAIR
                        """;

        int escolha;

        do {
            System.out.println(menu);
            escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    System.out.println("INSIRA O NÚMERO: ");
                    int numeroAdd = Integer.parseInt(scanner.nextLine());

                    System.out.println("INSIRA O NOME: ");
                    String nomeAdd = scanner.nextLine();

                    System.out.println("INSIRA A IDADE: ");
                    int idadeAdd = Integer.parseInt(scanner.nextLine());

                    System.out.println("INSIRA O SEXO: ");
                    char sexoAdd = scanner.nextLine().charAt(0);

                    System.out.println("INSIRA O VALOR DO AUTOMÓVEL: ");
                    float vAutomovelAdd = Float.parseFloat(scanner.nextLine());

                    Apolice novaApolice = new Apolice(numeroAdd, nomeAdd, idadeAdd, sexoAdd, vAutomovelAdd);

                    listaDeApolices.add(novaApolice);

                    System.out.println("APÓLICE ADICIONADO!");
                    break;
                case 2:
                    System.out.println("INSIRA O NÚMERO: ");
                    int numeroVerDados = Integer.parseInt(scanner.nextLine());

                    boolean apoliceExiste = false;

                    for (Apolice apolice: listaDeApolices) {
                        if (apolice.getNumero() == numeroVerDados) {
                            apoliceExiste = true;
                            System.out.println(apolice.toString());
                            break;
                       }
                    }
                    if (!apoliceExiste) {
                        System.out.println("APÓLICE NÃO ENCONTRADA!");
                    }
                    break;
                case 3:
                    System.out.println("SAINDO...");
                default:
                    System.out.println("VOCÊ DIGITOU UMA OPÇÃO QUE NÃO ESTÁ ENTRE AS DISPONÍVEIS!" +
                            "TENTE NOVAMENTE!");
                    break;
            }
        } while (escolha != 3);
    }
}


