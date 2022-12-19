package Estudo_Sequencias_Basicas;

public class Atv12AlugueldeCarros {
    public static void main(String[] args) {
        int diasAlugados = 10;
        double kmPercorridos = 120;
        double valorDias = diasAlugados*90;
        double valorkm = kmPercorridos*0.20;
        double valorTotal = valorDias+valorkm;

        System.out.printf("Dias alugados %d %nKM percorridos %.1fkm " +
                "%nValor do aluguel do carro R$%.2f",diasAlugados,kmPercorridos,valorTotal);
    }
}
