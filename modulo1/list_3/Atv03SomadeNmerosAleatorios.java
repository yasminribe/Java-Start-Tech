package list_3;

import java.util.Random;
import java.util.Scanner;

public class Atv03SomadeNmerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int soma = 0;

        System.out.print("Digite quantas vezes o numero deve ser sorteado: ");
        int quantidadeSorteado = scan.nextInt();

        for (int contador = 0; contador < quantidadeSorteado; contador++) {
            int numeroSorteado = random.nextInt(1, 7);
            soma += numeroSorteado;
            System.out.printf("O número %d foi sorteado!%n", numeroSorteado);
        }
        System.out.printf("A soma dos números sorteados é %d", soma);
    }
}
