package list_5;

import java.util.Scanner;

public class Atv01MelhorarConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unidade;
        String mensagem = "Digite a temperatura: ";
        double graus;
        try {
            System.out.print("Deseja converte em C ou F: ");
            unidade = scan.nextLine().toUpperCase();
            if (!unidade.equals("C") && !unidade.equals("F")) {
                throw new Error("Grau não identificado");
            }
            System.out.print(mensagem);
            graus = scan.nextDouble();
            if (unidade.equals("C")) {
                System.out.printf("A temperatura informada foi %.1fº%S.%n" +
                        "Ela equivale a %.1fº Farenheit.", graus, unidade, ConverteParaFahrenheit(graus));
            } else {
                System.out.printf("A temperatura informada foi %.1fº%S.%n" +
                        "Ela equivale a %.1fº Celsius.", graus, unidade, converteParaCelsius(graus));
            }
        } catch (Error msg) {
            System.out.println("Grau não identificado");
        } catch (Exception e) {
            System.out.println("Erro, número invalid");
        }

    }
    static double converteParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static double ConverteParaFahrenheit(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}
