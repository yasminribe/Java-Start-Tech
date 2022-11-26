package Estudo_Sequencias_Basicas;

public class Atv10CalculandoDescontos {
    public static void main(String[] args) {
        double valorProduto = 100.85;
        double descontoProduto = valorProduto - (valorProduto * 5) / 100;

        System.out.printf("O valor do produto é R$ %.2f%n" +
                "Com desconto sai R$ %.2f  ", valorProduto, descontoProduto);
    }
}
