package Estudo_Lacos;

import java.util.Scanner;

public class Atv02ContagemUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int contagem = scan.nextInt();
        int numero =1;
        System.out.print("Contagem: ");
        while (numero <= contagem){
            System.out.print(numero + " ");
            numero++;
        }
        System.out.print("ACABOU!");
    }


}
