package Modelos;

import java.util.Scanner;

public interface Aluno {

    double calculaMedia();

    String verificaAprovacao();

    String toString();

    void pedeInfo(Scanner scanner);
}
