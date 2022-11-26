package Estudo_Sequencias_Basicas;

public class Atv11ReajusteSalarial {
    public static void main(String[] args) {
        double salario = 1000;
        double aumentoSalario = salario + (salario * 15) / 100;
        System.out.printf("Salário atual R$ %.2f%n" +
                "Salário com aumento R$ %.2f", salario, aumentoSalario);
    }
}
