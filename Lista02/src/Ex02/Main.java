package Ex02;

import Ex02.Modelos.Vendedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vendedor> listaDeVendedores = new ArrayList<>();

        String menu =
                """
                    DIGITE UMA DAS OPÇÕES:
                    1 - ADICIONAR VENDEDOR
                    2 - CALCULAR VENDA
                    3 - SAIR
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

                    System.out.println("INSIRA O PERCENTUAL DE COMISSÃO: ");
                    double vAutomovelAdd = Double.parseDouble(scanner.nextLine());

                    Vendedor novoVendedor = new Vendedor(codigoAdd, nomeAdd, vAutomovelAdd);

                    listaDeVendedores.add(novoVendedor);

                    System.out.println("VENDEDOR ADICIONADO!");
                    break;
                case 2:
                    System.out.println("INSIRA O CÓDIGO: ");
                    int codigoConferir = Integer.parseInt(scanner.nextLine());

                    boolean vendedorExiste = false;

                    for (Vendedor vendedor: listaDeVendedores) {
                        if (vendedor.getCodigo() == codigoConferir) {
                            vendedorExiste = true;
                            System.out.println("INSIRA O VALOR DA VENDA: ");
                            double valorVendaAdd = Double.parseDouble(scanner.nextLine());

                            System.out.println("INSIRA O VALOR DO DESCONTO: ");
                            double valorDescontoAdd = Double.parseDouble(scanner.nextLine());

                            System.out.println(vendedor.toString(valorVendaAdd, valorDescontoAdd));
                            break;
                        }
                    }

                    if (!vendedorExiste) {
                        System.out.println("VENDEDOR NÃO ENCONTRADO!");
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



