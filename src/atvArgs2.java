public class atvArgs2 {
    public static void main(String[] args) {
        int cadeiras = Integer.parseInt(args[0]), fileiras =  Integer.parseInt(args[1]),
                capacidade = fileiras * cadeiras;
        System.out.printf("A sala de cinema tem %d fileiras e %d cadeiras em cada.\n" +
                "A capacidade dessa sala é de %d pessoas.",fileiras,cadeiras,capacidade);

        //---------------------DESAFIO--------------------------|

        double pdc = capacidade* Double.parseDouble(args[2]);
        System.out.printf("%nsendo que %.0f lugares são reservados para PCDs.",pdc);
    }
}
