package list_3;

import java.util.Random;
import java.util.Scanner;

public class Atv04sorteioDeNumeroAleatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int numeroSorteado;
        int quantidadeSorteio = 0;

        System.out.print("Digite um número: ");
        int numeroEscolhido = scan.nextInt();

        if (numeroEscolhido < 1 || numeroEscolhido > 6) {
            System.out.println("Erro! Digite um número entre 1 e 6");
        }
        while (true) {
            numeroSorteado = random.nextInt(1, 7);
            quantidadeSorteio++;

            System.out.printf("O numero sorteado foi %d%n", numeroSorteado);

            if (numeroSorteado == numeroEscolhido) {
                System.out.printf("Foram necessários %d sorteios para que o número %d fosse sorteado%n",
                        quantidadeSorteio, numeroSorteado);
                break;
            }

        }
    }
}

