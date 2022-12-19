package Estudo_Condicionais;

import java.util.Calendar;
import java.util.Scanner;

public class Atv02PodeVotar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar ano = Calendar.getInstance();
        int anoNascimento,
                anoAtual = ano.get(Calendar.YEAR);

        System.out.print("Digite seu ano de nascimento (xxxx): ");
        anoNascimento = scan.nextInt();
        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.printf("Sua idade em %d é %d anos%n" +
                    "Você já Pode votar", anoAtual, idade);
        } else {
            System.out.printf("Sua idade em %d é %d anos%n" +
                    "Você ainda não pode votar", anoAtual, idade);
        }
    }
}
