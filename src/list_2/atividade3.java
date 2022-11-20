package list_2;

import java.util.Scanner;
//A pessoa que está solicitando o empréstimo tem 22 anos de idade e tem o salário de 10000.0 reais.
//O valor solicitado é de 30000.0 reais para ser pago em 24 parcelas.
//O empréstimo foi aprovado.
public class atividade3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade,parcela;
        double renda,valorEmprestimo;

        System.out.print("Digite a idade: ");
        idade =scan.nextInt();
        System.out.print("Digite a Qnt de parcelas: ");
        parcela=scan.nextInt();
        System.out.print("Digite a sua Renda: ");
        renda =scan.nextDouble();
        System.out.print("Digite o Valor do Emprestimo: ");
        valorEmprestimo=scan.nextDouble();

        renda = renda *0.30 ;
        valorEmprestimo = valorEmprestimo/parcela;

        if ((idade >=18 && idade <=65) && (parcela >=3 && parcela <= 24) && (valorEmprestimo <= renda)){
            System.out.println("O empréstimo foi aprovado.");
        }else {
            System.out.println("O empréstimo foi reprovado.");
        }
    }
}
