package Ex01.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private List<Aluno> listaDeAlunos;

    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.listaDeAlunos = new ArrayList<>();
    }

    public void insereAluno(Aluno aluno, int codigoAddAluno, List<Curso> listaDeCursos) {
        boolean alunoAdicionado = false;
        for (Curso curso: listaDeCursos) {
            if (curso.getCodigo() == codigoAddAluno) {
                listaDeAlunos.add(aluno);
                alunoAdicionado = true;
                System.out.println("ALUNO ADICIONADO AO CURSO!");
                break;
            }
        }
        if (!alunoAdicionado) {
            System.out.println("HOUVE ALGUM ERRO NA OPERAÇÃO, TENTE NOVAMENTE!");
        }
    }

    public void removeAluno(int codigoRemoverAluno,
                            String raRemoveAluno, List<Curso> listaDeCursos) {

        boolean alunoRemovido = false;

        for (Curso curso: listaDeCursos) {
            if (curso.getCodigo() == codigoRemoverAluno) {
                for (Aluno alunoRemover: listaDeAlunos) {
                    if (alunoRemover.getRa().equals(raRemoveAluno)) {
                        listaDeAlunos.remove(alunoRemover);
                        alunoRemovido = true;
                        System.out.println("ALUNO REMOVIDO!");
                        break;
                    }
                }
                if (!alunoRemovido) {
                    System.out.println("ALUNO NÃO ENCONTRADO!");
                }
            }
        }
    }


    @Override
    public String toString() {
        String informacoes = "CÓDIGO: " + this.getCodigo() +
                " NOME: " + this.getNome() +
                " CARGA HORÁRIA: " + this.getCargaHoraria();
        return informacoes;
    }

    public String toStringCompleto() {
        String alunosDoCurso ="";
        for (Aluno aluno: listaDeAlunos) {
            alunosDoCurso += aluno.toString();
        }
        return toString() + alunosDoCurso;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }
}
