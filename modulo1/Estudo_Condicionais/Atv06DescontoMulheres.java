package Estudo_Condicionais;

import java.util.Scanner;

public class Atv06DescontoMulheres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome,
                sexo;
        double valorCompra;
        System.out.print("Digite o nome: ");
        nome = scan.nextLine();
        System.out.print("Digite o sexo (F) ou (M) : ");
        sexo = scan.nextLine().toUpperCase();

        if ((!sexo.equals("F")) && !sexo.equals("M")) {
            System.out.println("ERRO opção invalida");
        } else {
            System.out.print("Digite o valor da compra R$ ");
            valorCompra = scan.nextDouble();
            double desconto;

            if (sexo.equals("F")) {
                desconto = valorCompra - (valorCompra * 13) / 100;

            } else {
                desconto = valorCompra - (valorCompra * 5) / 100;
            }
            System.out.printf("Bem vinda(o) %S%nValor total R$ %.2f %nO valor total com DESCONTO ESPECIAL " +
                    "R$ %.2f", nome, valorCompra, desconto);
        }

    }
}
