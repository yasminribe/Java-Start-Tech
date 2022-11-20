package list_2;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1, n2,n3,n4,media;
        System.out.print("Digite a primeira nota: ");
        n1=scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2=scan.nextDouble();
        System.out.print("Digite a terceira nota: ");
        n3=scan.nextDouble();
        System.out.print("Digite a quarta nota: ");
        n4=scan.nextDouble();
        media=(n1+n2+n3+n4)/4;
        System.out.printf("As notas do aluno são: %.1f, %.1f, %.1f e %.1f %n" +
                "A média final é %.1f.%n",n1,n2,n3,n4,media);
        if (media >= 6){
            System.out.println("O aluno foi aprovado.");
        }else {
            System.out.println("O aluno foi reprovado.");
        }

    }
}
