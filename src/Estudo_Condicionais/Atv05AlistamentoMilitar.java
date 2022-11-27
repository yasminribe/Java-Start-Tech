package Estudo_Condicionais;

import java.util.Calendar;
import java.util.Scanner;

public class Atv05AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar ano = Calendar.getInstance();
        int anoAtual = ano.get(Calendar.YEAR),
                anoNascimento;
        System.out.print("Digite seu ano de nascimento (YYYY): ");
        anoNascimento = scan.nextInt();
        int idade = anoAtual - anoNascimento;
        if (idade <= 18) {
            System.out.printf("Sua idade: %d anos %nFalta %d anos para o alistamento militar", idade, (18 - idade));
        } else {
            System.out.printf("Sua idade: %d anos %nFaz %d anos que você fez o alistamento militar", idade, (idade - 18));
        }
    }
}
