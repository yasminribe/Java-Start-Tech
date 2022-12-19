package list_2;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temperatura,farenheit, celsius;
        String unidade, msg ="Escolha Temperatura que deseja converter: ";

        System.out.print("Escolha a unidade de temperatura C ou F: ");
        unidade=scan.nextLine();

        if (!unidade.equals("C") && !unidade.equals("c") && (!unidade.equals("F") && !unidade.equals("f"))){
            System.out.printf("ERRO, A letra %S não corresponde a uma unidade de medida de temperatura.",unidade);
        }else if (unidade.equals("C") || unidade.equals("c")){
            System.out.print(msg);
            temperatura = scan.nextDouble();
            farenheit=(temperatura*9/5)+32;
            System.out.printf("A temperatura informada foi %.1fº%S.\n" +
                    "Ela equivale a %.1fº Farenheit.",temperatura,unidade,farenheit);
        }else {
            System.out.print(msg);
            temperatura = scan.nextDouble();
            celsius =(temperatura - 32)*5/9;
            System.out.printf("A temperatura informada foi %.1fº%S.\n" +
                     "Ela equivale a %.1fº Celsius.",temperatura,unidade,celsius);
         }

    }
}
