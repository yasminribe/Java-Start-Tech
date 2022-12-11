package Estudo_Lacos;

public class Atv03MarcandoOsDivisiveisPor4 {
    public static void main(String[] args) {
        int contagem = 30;
        while (contagem >=1){
            if (contagem % 4 == 0){
                System.out.print("["+contagem+"] ");
            }else {
                System.out.print(contagem + " ");
            }
            contagem --;
        }

    }
}
