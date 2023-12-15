package Ex01;

import Ex01.Modelos.Aluno;
import Ex01.Modelos.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Curso> listaDeCursos = new ArrayList<>();

        String menu =
                """
                    ESCOLHA UMA DAS OPÇÕES:
                    1 - ADICIONAR CURSO
                    2 - ADICIONAR ALUNO
                    3 - REMOVER ALUNO
                    4 - MOSTRAR TODOS OS CURSOS
                    5 - MOSTRAR OS ALUNOS DE DETERMINADO CURSO
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
                    String nomeCursoAdd = scanner.nextLine();

                    System.out.println("INSIRA A CARGA HORÁRIA: ");
                    int cargaHorariaAdd = Integer.parseInt(scanner.nextLine());

                    Curso novoCurso = new Curso(codigoAdd, nomeCursoAdd, cargaHorariaAdd);

                    listaDeCursos.add(novoCurso);

                    System.out.println("CURSO ADICIONADO!");
                    break;
                case 2:
                    System.out.println("INSIRA O RA: ");
                    String raAdd = scanner.nextLine();

                    System.out.println("INSIRA O NOME: ");
                    String nomeAlunoAdd = scanner.nextLine();

                    System.out.println("INSIRA O CÓDIGO DO CURSO DO ALUNO: ");
                    int codigoAddAluno = Integer.parseInt(scanner.nextLine());

                    Aluno novoAluno = new Aluno(raAdd, nomeAlunoAdd);

                    Curso curso = null;

                    for (Curso c : listaDeCursos) {
                        if (c.getCodigo() == codigoAddAluno) {
                            curso = c;
                            break;
                        }
                    }
                    curso.insereAluno(novoAluno, codigoAddAluno, listaDeCursos);
                    break;
                case 3:
                    System.out.println("INSIRA O CÓDIGO DE DETERMINADO CURSO: ");
                    int codigoCursoRemoveAl = Integer.parseInt(scanner.nextLine());

                    System.out.println("INSIRA O RA DO ALUNO: ");
                    String raRemoveAluno = scanner.nextLine();

                    Curso cursoEmQuestao = null;

                    for (Curso c : listaDeCursos) {
                        if (c.getCodigo() == codigoCursoRemoveAl) {
                            cursoEmQuestao = c;
                            cursoEmQuestao.removeAluno(codigoCursoRemoveAl, raRemoveAluno, listaDeCursos);
                        }
                    }
                    if (cursoEmQuestao == null) {
                        System.out.println("CURSO NÃO ENCONTRADO!");
                    }
                    break;
                case 4:
                    for (Curso c: listaDeCursos) {
                        System.out.println(c.toString());
                    }
                    break;
                case 5:
                    System.out.println("INSIRA O CÓDIGO DE DETERMINADO CURSO: ");
                    int codigoMostrarAlunos = Integer.parseInt(scanner.nextLine());

                    boolean cursoMostrado = false;

                    for (Curso c: listaDeCursos) {
                        if (c.getCodigo() == codigoMostrarAlunos) {
                            System.out.println(c.toStringCompleto());
                            cursoMostrado = true;
                            break;
                        }
                    }
                    if (!cursoMostrado) {
                        System.out.println("CURSO NÃO ENCONTRADO!");
                    }
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



