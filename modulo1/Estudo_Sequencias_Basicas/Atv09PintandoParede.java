package Estudo_Sequencias_Basicas;

public class Atv09PintandoParede {
    public static void main(String[] args) {
        double largura = 30;
        double altura = 10;
        double areaSerPintada = largura*altura;
        double quantidadeTinta = areaSerPintada/2;

        System.out.printf("Para pintar uma area de %.1fm² é " +
                "necessario %.1f litros de tinta",areaSerPintada,quantidadeTinta);
    }
}
