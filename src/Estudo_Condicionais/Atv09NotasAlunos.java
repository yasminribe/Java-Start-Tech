package Estudo_Condicionais;

import java.util.Scanner;

public class Atv09NotasAlunos {
    public static void main(String[] args) {
        double n1, n2;
        Scanner scan = new Scanner(System.in);


        System.out.print("digite a primeira nota: ");
        n1 = scan.nextDouble();
        System.out.print("digite a segunda nota: ");
        n2 = scan.nextDouble();


        double media = (n1 + n2) / 2;
        boolean nota1 = n1 < 0 || n1 > 10;
        boolean nota2 = n2 < 0 || n2 > 10;
        if (nota1 || nota2) {
            System.out.println("Erro! digite novamente um nota entre 0 e 10");
        } else {
            if (media >= 7) {
                System.out.println("Aprovado");
            } else if (media >= 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("reprovado");
            }
            System.out.printf("Sua média final %.1f", media);
        }
    }
}
