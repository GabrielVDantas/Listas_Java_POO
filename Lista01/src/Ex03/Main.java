package Ex03;

import Ex03.Modelos.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        String menu =
                """
                    DIGITE UMA DAS OPÇÕES:
                    1 - ADICIONAR FUNCIONÁRIO
                    2 - MOSTRAR FOLHA DE PAGAMENTO
                    3 - ALTERAR REMUNERAÇÃO
                    4 - SAIR
                        """;

        int escolha;

        do {
            System.out.println(menu);
            escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    System.out.println("INSIRA O CRACHÁ: ");
                    int crachaAdd = Integer.parseInt(scanner.nextLine());

                    System.out.println("INSIRA O NOME: ");
                    String nomeAdd = scanner.nextLine();

                    System.out.println("INSIRA O VÍNCULO: ");
                    char vinculoAdd = scanner.nextLine().charAt(0);

                    Funcionario novoFuncionario = new Funcionario(crachaAdd, nomeAdd, vinculoAdd);

                    if (vinculoAdd == 'H') {
                        System.out.println("INSIRA O VALOR DA HORA: ");
                        float vHoraAdd = Float.parseFloat(scanner.nextLine());
                        novoFuncionario.setValorHora(vHoraAdd);

                        System.out.println("INSIRA O TOTAL DE HORAS: ");
                        float qtdeHoraAdd = Float.parseFloat(scanner.nextLine());
                        novoFuncionario.setQtdeHora(qtdeHoraAdd);
                    } else {
                        System.out.println("INSIRA O VALOR DO SALÁRIO: ");
                        float salarioAdd = Float.parseFloat(scanner.nextLine());
                        novoFuncionario.setSalario(salarioAdd);
                    }

                    System.out.println("INSIRA O VALOR DO DESCONTO: ");
                    float descontoAdd = Float.parseFloat(scanner.nextLine());
                    novoFuncionario.setValorDesconto(descontoAdd);

                    listaDeFuncionarios.add(novoFuncionario);

                    System.out.println("FUNCIONÁRIO ADICIONADO!");
                    break;
                case 2:
                    System.out.println("INSIRA O CRACHÁ: ");
                    int crachaMostra = Integer.parseInt(scanner.nextLine());

                    for (Funcionario funcionario: listaDeFuncionarios) {
                        if (funcionario.getCracha() == crachaMostra) {
                            System.out.println(funcionario.toString());
                            break;
                        }
                        System.out.println("FUNCIONÁRIO NÃO ENCONTRADO!");
                    }
                    break;
                case 3:
                    System.out.println("INSIRA O CRACHÁ: ");
                    int crachaAltera = Integer.parseInt(scanner.nextLine());

                    Funcionario funcionarioPalterar = new Funcionario();

                    funcionarioPalterar.atualizaFuncionario(listaDeFuncionarios, crachaAltera, scanner);
                    break;
                case 4:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("VOCÊ DIGITOU UMA OPÇÃO QUE NÃO ESTÁ ENTRE AS DISPONÍVEIS!" +
                            "TENTE NOVAMENTE!");
                    break;
            }
        } while (escolha != 4);
    }
}

