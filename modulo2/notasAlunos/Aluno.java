package notasAlunos;

public class Aluno {
    private String nome;
    private double [] notas;

    public Aluno(String nome, double[] notas) {
        this.setNome(nome);
        this.setNotas(notas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double calcularMedia(){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }
}
