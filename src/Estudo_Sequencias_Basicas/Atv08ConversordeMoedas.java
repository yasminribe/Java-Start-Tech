package Estudo_Sequencias_Basicas;

public class Atv08ConversordeMoedas {
    public static void main(String[] args) {
        double dinheiro = 10;
        double ValorDolar = 5.41;
        System.out.printf("Seu saldo em carteira é R$ %.2f%n" +
                "Valor convertido para Dolar U$ %.2f",dinheiro,(dinheiro/ValorDolar));
    }
}
