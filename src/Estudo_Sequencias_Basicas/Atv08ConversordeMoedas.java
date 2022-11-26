package Estudo_Sequencias_Basicas;

public class Atv08ConversordeMoedas {
    public static void main(String[] args) {
        double dinheiro = 125.90;
        double ValoremDolar = dinheiro/5.41;
        System.out.printf("Seu saldo em carteira é R$ %.2f%n" +
                "Valor convertido para Dolar U$ %.2f",dinheiro,ValoremDolar);
    }
}
