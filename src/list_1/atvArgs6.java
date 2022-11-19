package list_1;

public class atvArgs6 {
    public static void main(String[] args) {
        double largura = Double.parseDouble(args[0]), comprimento =Double.parseDouble(args[1]) ,
                profundidade = Double.parseDouble(args[2]),
                litros = largura*comprimento*profundidade/0.0010000;

        System.out.printf("As dimensões da piscina são %.0fm x %.0fm x %.1fm.\n" +
                "Essa piscina comporta %.1f litros de água.",largura,comprimento,profundidade,litros);

        System.out.println("\n\n|--------------DESAFIO-----------------|");

        double profundidadeIn = Double.parseDouble(args[3]) ,
                profundidadeMedia = (profundidadeIn + profundidade)/2,
                litrosProfundidade = largura*comprimento*profundidadeMedia/0.0010000;

        System.out.printf("%nAs dimensões da piscina são %.0fm x %.0fm. " +
                        "Sua profundiade inicial é %.1fm e sua profundidade final é %.1fm.\n" +
                        "Essa piscina comporta %.1f litros de água.",largura,comprimento,
                profundidadeIn,profundidade,litrosProfundidade);
    }
}
