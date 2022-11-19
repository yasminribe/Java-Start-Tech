package list_1;

public class atvArgs3 {
    public static void main(String[] args) {
        double km = Double.parseDouble(args[0]) , mi= Double.parseDouble(args[1]) ,
                conversao = km * mi;
        System.out.printf("O valor recebido em kilômetros é %.1f %n" +
                "O resultado em milhas é %f ",km,conversao);
    }
}
