package list_3;

import java.util.Scanner;

public class Atv05OcorrenciaLetras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine().toLowerCase();

        System.out.print("Digite uma letra: ");
        String letra = scan.nextLine().toLowerCase();

        if (letra.length() != 1) {
            System.out.printf("É necessário informar apenas 1 letra, mas foram informada %d", letra.length());
        } else {
            for (int i = 0; i < palavra.length(); i++) {
                if (letra.charAt(0) == palavra.charAt(i)) {
                    contador++;
                }
            }
            System.out.printf("Na palavra %s TEM %d letra(s) %S", palavra, contador,letra);
        }

    }
}
