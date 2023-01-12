package estudo_JavaUtil;

public class TesteArrays {
    public static void main(String[] args) {
        int [] idades = new int[4]; // inicia com 0
        String [] nomes = {"Pedro","luan","Joâo"};
        idades[0]=29;
        idades[1]=39;
        idades[2]=19;
        idades[3]=59;

        int idade= idades[3];

        System.out.println(idade);
        System.out.println(idades.length);//tamanho

        System.out.println(nomes[0]);

        for (int i = 0; i < idades.length; i++){
            idades[i] = i * i;
        }
        for (int i = 0; i < idades.length; i++){
            System.out.println("multiplicacão das idades " + idades[i]);
        }


    }
}
