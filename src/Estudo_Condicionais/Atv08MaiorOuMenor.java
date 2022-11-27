package Estudo_Condicionais;

import java.util.Scanner;

public class Atv08MaiorOuMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1,
                numero2;

        System.out.print("Digite um número: ");
        numero1 = scan.nextInt();
        System.out.print("Digite outro número: ");
        numero2 = scan.nextInt();

        if (numero1 > numero2){
            System.out.printf("O número %d é MAIOR",numero1);
        } else if (numero2 > numero1) {
            System.out.printf("O número %d é MAIOR",numero2);
        }else {
            System.out.printf("Os números %d e %d são IGUAIS",numero1,numero2);
        }

    }


}
