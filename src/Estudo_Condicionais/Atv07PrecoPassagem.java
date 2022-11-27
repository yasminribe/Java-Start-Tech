package Estudo_Condicionais;

import java.util.Scanner;

public class Atv07PrecoPassagem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Distância da viagem (KM): ");
        double distancia = scan.nextDouble();
        double valorPassagem;

        if (distancia <= 200){
            valorPassagem = distancia * 0.50;
        }else {
            valorPassagem = distancia * 0.45;
        }
        System.out.printf("O valor da passagem R$ %.2f %nBOA VIAGEM!",valorPassagem);
    }
}
