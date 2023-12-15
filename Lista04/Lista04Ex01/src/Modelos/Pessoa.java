package Modelos;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    public void pedeInfoDaPessoa(Scanner scanner) {
        try {
            System.out.println("INSIRA O NOME: ");
            String nomePessoa = scanner.nextLine();
            setNome(nomePessoa);

            System.out.println("INSIRA O CPF: ");
            String cpfPessoa = scanner.nextLine();
            setCpf(cpfPessoa);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("VOCÊ DIGITOU ALGO QUE NÃO CORRESPONDE COM A PERGUNTA");
        }
    }

    @Override
    public String toString() {
        String infoPessoa = "NOME: " + this.getNome() +
                " CPF: " + this.getCpf();
        return infoPessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
