package Estudo_Condicionais;

import java.util.Scanner;

public class Atv01RadarEletronico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double velocidade;

        System.out.print("Digite a velocidade do carro: ");
        velocidade = scan.nextDouble();
        double valorMulta = (velocidade - 80) * 5;

        if (velocidade > 80){
            System.out.printf("Motorista acima do limite de velocidade%n" +
                    "MULTADO --------- Valor da multa R$ %.2f ",valorMulta);
        }

    }
}
