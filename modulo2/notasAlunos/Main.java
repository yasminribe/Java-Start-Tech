package notasAlunos;

import utils.Leitor;

public class Main {
    private final static int qntAlunos = 3;
    private final static int qntnotas = 3;

    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        Aluno[] alunos = new Aluno[qntAlunos];

        for (int i =0;i < qntAlunos; i++){
            String nome = leitor.lerString("Digite nome do Aluno: ");
            double[] notas = leitor.lerVariosDecimais("Digite a nota ",qntnotas);
            alunos[i] = new Aluno(nome,notas);
        }
        for (Aluno aluno: alunos) {
            System.out.printf("%s teve a média %.1f%n",aluno.getNome(),aluno.calcularMedia());
        }
    }
}
