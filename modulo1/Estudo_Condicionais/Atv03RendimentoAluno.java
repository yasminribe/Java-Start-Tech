package Estudo_Condicionais;

import java.util.Scanner;

public class Atv03RendimentoAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        double nota1, nota2;

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.printf("Aluno: %s %nMedia do Aluno: %.1f%n", nome, media);
        if (media >= 7) {
            System.out.println("Bom aproveitamento");
        } else {
            System.out.println("Aproveitamento a baixo da média");
        }
    }
}
