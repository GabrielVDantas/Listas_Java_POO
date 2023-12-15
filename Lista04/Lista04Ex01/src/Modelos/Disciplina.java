package Modelos;

import java.util.Scanner;

public class Disciplina {
    private int codigo;
    private String nome;

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Disciplina() {
    }

    public void pedeInfoDaDisciplina(Scanner scanner) {
        try {
            System.out.println("INSIRA O CÓDIGO: ");
            int codigoDisciplina = Integer.parseInt(scanner.nextLine());
            setCodigo(codigoDisciplina);

            System.out.println("INSIRA O NOME: ");
            String nomeDisciplina = scanner.nextLine();
            setNome(nomeDisciplina);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("VOCÊ DIGITOU ALGO QUE NÃO CORRESPONDE COM A PERGUNTA");
        }
    }

    @Override
    public String toString() {
        String infoDisciplina = "CÓDIGO: " + this.getCodigo() +
                " NOME: " + this.getNome();
        return infoDisciplina;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
