package piscina;

import utils.Leitor;

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        double l = leitor.lerDecimal("Digite a largura: ");
        double c = leitor.lerDecimal("Digite o comprimento: ");
        double p = leitor.lerDecimal("Digite a profundidade: ");

        Piscina piscina = new Piscina(l , c ,p);
        System.out.println(piscina);
        System.out.printf("O volume da piscina é %.1f m³.",piscina.CalcularVolume());

    }
}