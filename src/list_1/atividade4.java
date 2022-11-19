package list_1;//4. Converter de reais para diversas moedas

public class atividade4 {
    public static void main(String[] args) {
        double real = 10, dolar = 0.19, euro = 0.18, libra = 0.16 , peso = 30.31, iene = 26.07;
        double conversaoDolar = real*dolar, conversaoEuro = real * euro,
                conversaoLibra = real*libra, conversaoPeso = real*peso, conversaoIene = real * iene;
        System.out.printf("O valor recebido é de %.2f reais.\n" +
                "Isso equivale a:\n" +
                "- %.2f dólares\n" +
                "- %.2f  euros\n" +
                "- %.2f  libras\n" +
                "- %.2f  pesos argentinos\n" +
                "- %.2f  Iene",
                real,conversaoDolar,conversaoEuro,conversaoLibra,conversaoPeso,conversaoIene);
    }
}
