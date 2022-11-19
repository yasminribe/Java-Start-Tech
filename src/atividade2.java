//2-Calcular a quantidade de pessoas que cabem em uma sala de cinema

public class atividade2 {
    public static void main(String[] args) {
        int cadeiras =10, fileiras = 10, capacidade = fileiras * cadeiras;
        System.out.printf("A sala de cinema tem %d fileiras e %d cadeiras em cada.\n" +
                "A capacidade dessa sala é de %d pessoas.",fileiras,cadeiras,capacidade);

        //---------------------DESAFIO--------------------------|

        double pdc = capacidade*0.10;
        System.out.printf("%nsendo que %.0f lugares são reservados para PCDs.",pdc);
    }
}
