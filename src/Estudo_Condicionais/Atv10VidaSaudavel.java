package Estudo_Condicionais;

import java.util.Scanner;

public class Atv10VidaSaudavel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tempo de atividade: ");
        int tempoDeAtividade = scan.nextInt();
        int pontos = 0;
        double valor = 0;

        if (tempoDeAtividade <= 10) {
            pontos = tempoDeAtividade * 2;
        } else if (tempoDeAtividade <= 20) {
            pontos = tempoDeAtividade * 5;
        } else {
            pontos = tempoDeAtividade * 10;
        }
        valor = pontos * 0.05;
        System.out.println("Pontos feitos: "+pontos);
        System.out.println("Valor a receber R$ " + valor);
    }
}
