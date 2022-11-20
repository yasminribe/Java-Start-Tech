package list_2;

import java.util.Random;
import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Random sorteio = new Random();
        Scanner entrada = new Scanner(System.in);

        int aposta, numeroSorteado = sorteio.nextInt(6)+1;

        System.out.print("Escolha um número entre 1 e 6: ");
        aposta = entrada.nextInt();

        if (aposta == numeroSorteado){
            System.out.printf("Numero Apostado %d %nNumero Sorteado %d %nGANHOU!!",aposta,numeroSorteado);
        }else {
            System.out.printf("Numero Apostado %d %nNumero Sorteado %d %nPERDEU",aposta,numeroSorteado);
        }
    }
}
