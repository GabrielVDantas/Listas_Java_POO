package Ex01.Modelos;

public class Pessoa {
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    @Override
    public String toString() {
        return "CPF: " + this.getCpf() +
                " NOME: " + this.getNome() +
                " SEXO: " + this.getSexo() +
                " IDADE; " + this.getIdade();
    }

    public Pessoa(String cpf, String nome, char sexo, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }
}
