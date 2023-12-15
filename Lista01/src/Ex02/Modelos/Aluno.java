package Ex02.Modelos;

public class Aluno {
    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public Aluno(String ra, String nome, float ac1, float ac2, float ag, float af) {
        this.ra = ra;
        this.nome = nome;
        this.ac1 = ac1;
        this.ac2 = ac2;
        this.ag = ag;
        this.af = af;
    }

    public float calculaMedia() {
        float media = (float) ((ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45));
        return media;
    }


    public String verificaAprovacao(float media) {
        if (media >= 5) {
            return "APROVADO!";
        } else {
            return "REPROVADO!";
        }
    }

    @Override
    public String toString() {
        return "RA: " + this.getRa() +
                " NOME: " + this.getNome() +
                " MÉDIA: " + calculaMedia() +
                " SITUAÇÃO: " + verificaAprovacao(calculaMedia());
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public float getAc1() {
        return ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public float getAg() {
        return ag;
    }

    public float getAf() {
        return af;
    }
}
