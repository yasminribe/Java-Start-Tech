package list_4;

import java.util.Arrays;

public class Atv01EncontrarMenorEMaiorValor {
    public static void main(String[] args) {
        int[] valores = {5, 7, 22, 11, 15, 10, 1, 9,55};
        int maior = valores[0];
        int menor = valores[0];

        for (int num : valores) {
            maior = Math.max(num, maior);
            menor = Math.min(num, menor);
        }
        System.out.println("Numeros de entrada: "+Arrays.toString(valores));
        System.out.printf("O MENOR número: %d e o MAIOR número: %d",menor,maior);
    }
}
