package list_3;

import java.util.Scanner;

public class Atv02Escada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        for (int linha = 0 ; linha <=num; linha++){
            for (int coluna = 0 ; coluna <= linha; coluna ++){
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }
}
