package Estudo_Condicionais;

import java.util.Scanner;

public class Atv04ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.print("Digite um numero: ");
        numero = scan.nextInt();
        if (numero % 2 == 0) {
            System.out.printf("Número %d é PAR",numero);
        } else {
            System.out.printf("Número %d é IMPAR",numero);
        }
    }
}
