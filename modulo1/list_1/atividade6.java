package list_1;//6. Calcular o volume de uma piscina

public class atividade6 {
    public static void main(String[] args) {
        double largura = 10, comprimento =20 , profundidade = 1.8,
                litros = largura*comprimento*profundidade/0.0010000;

        System.out.printf("As dimensões da piscina são %.0fm x %.0fm x %.1fm.\n" +
                "Essa piscina comporta %.1f litros de água.",largura,comprimento,profundidade,litros);

        System.out.println("\n|--------------DESAFIO-----------------|");

        double profundidadeIn = 1.2 , profundidadeMedia = (profundidadeIn + profundidade)/2,
        litrosProfundidade = largura*comprimento*profundidadeMedia/0.0010000;

        System.out.printf("%nAs dimensões da piscina são %.0fm x %.0fm. " +
                "Sua profundiade inicial é %.1fm e sua profundidade final é %.1fm.\n" +
                "Essa piscina comporta %.1f litros de água.",largura,comprimento,
                profundidadeIn,profundidade,litrosProfundidade);
    }
}
