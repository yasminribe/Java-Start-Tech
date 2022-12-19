package list_4;

import java.util.Arrays;
import java.util.Random;

public class Atv02CriandoGruposAlunos {
    public static void main(String[] args) {
        String[] alunos = {"Pedro","Alex", "Leticia", "Gabriela", "Juan","Bruna","Vanessa","Gustavo","Matheus"};
        int qntGrupos = alunos.length / 3;
        String[][] grupos = new String[qntGrupos][3];

        if (qntGrupos % 3 != 0) {
            System.out.println("Erro! Não foi possivel dividir em grupos de 3.");
        } else {
            System.out.println("Nome dos ALUNOS: " + Arrays.toString(alunos));
            for (int c = 0; c < qntGrupos; c++) {
                int alunosDoGrupo = 0;

                while (alunosDoGrupo < 3) {
                    Random random = new Random();
                    int sorteio = random.nextInt(0, alunos.length);

                    if (!alunos[sorteio].equals("")) {
                        grupos[c][alunosDoGrupo] = alunos[sorteio];
                        alunosDoGrupo++;
                        alunos[sorteio] = "";
                    }
                }
            }
            for (int i = 0; i < grupos.length; i++) {
                System.out.printf("Grupo %d:%n", i + 1);
                System.out.printf("%s%n", Arrays.toString(grupos[i]));
            }
        }
    }
}
