package Estudo_Sequencias_Basicas;

public class Atv07ConversordeMedidas {
    public static void main(String[] args) {
        double metros = 100;
        double centimetros = metros * 100;
        double milimetro = metros * 1000;

        System.out.printf("A distância de %.1f m corresponde a:%nCentimetros %.1fcm %nMilimetros %.1fmm",metros,centimetros,milimetro);
    }

}
