package Estudo_Lacos;

import java.util.Scanner;

public class Atv04LacoPeloUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite numero inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite numero Final: ");
        int Contagemfinal = scanner.nextInt();
        System.out.print("Digite numero de incremento: ");
        int incremento = scanner.nextInt();

        if (inicio <= Contagemfinal) {
            while (inicio <= Contagemfinal) {
                System.out.print(inicio + " ");
                inicio = inicio + incremento;
            }
        } else {
            while (Contagemfinal <= inicio) {
                System.out.print(inicio + " ");
                inicio -= incremento;
            }

            System.out.print("ACABOU!");
        }
    }
}
