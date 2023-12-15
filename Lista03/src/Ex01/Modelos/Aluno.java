package Ex01.Modelos;

public class Aluno {
    private String ra;
    private String nome;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public Aluno(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return " RA: " + this.getRa() +
                " NOME: " + this.getNome();
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
