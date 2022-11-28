package list_3;

import java.util.Scanner;

public class Atv1NumerosImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.print("Digite um número inteiro maior que zero(0): ");
    int numero = scan.nextInt();
        for (int contador = 1; contador <= numero; contador +=2 ){
            System.out.println(contador);
        }
    }
}
