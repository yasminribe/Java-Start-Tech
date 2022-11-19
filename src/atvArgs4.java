public class atvArgs4 {
    public static void main(String[] args) {
        double real = Double.parseDouble(args[0]), dolar =Double.parseDouble(args[1]),
                euro = Double.parseDouble(args[2]), libra = Double.parseDouble(args[3]) ,
                peso = Double.parseDouble(args[4]), iene = Double.parseDouble(args[5]);
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
