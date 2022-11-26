package Estudo_Sequencias_Basicas;

public class Atv13SalarioPorDiasTrabalhado {
    public static void main(String[] args) {
        int diasTrabalados = 5;
        double valorHoraTrabalhada = 25 * 8;
        double salarioMes = valorHoraTrabalhada * diasTrabalados;

        System.out.printf("A quantidade de dias trabalhados foram %d%n" +
                "Salario do mês R$ %.2f",diasTrabalados,salarioMes);
    }
}
