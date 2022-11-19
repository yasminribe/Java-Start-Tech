//1. Calcular a idade de uma pessoa

public class atividade1 {
    public static void main(String[] args) {
        int anoNascimento =1998, anoAtual = 2022, idade = anoAtual - anoNascimento;
        System.out.printf("O ano de nascimento informado é %d. %nA pessoa tem " +
                "(ou vai completar) %d anos",anoNascimento,idade);
    }
}