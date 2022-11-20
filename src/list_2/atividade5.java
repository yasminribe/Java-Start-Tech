package list_2;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario,faixaUm = 1212, desFaixaUm=0.075;
        double  faixaDois = 2427.35,descFaixaDois=0.09, calcFaixaDois;
        double faixaTres=3641.03,desFaixaTres=0.12, calcFaixaTres;
        double desFaixaQuatro = 0.14,calFaixaQuatro,faixaQuatro = 7087.22,
                descontoEmprego,tetoMax = (faixaQuatro - faixaTres)*desFaixaQuatro;;
        double calUm = faixaUm * desFaixaUm, calDois = (faixaDois - faixaUm) * descFaixaDois,
                calTres= (faixaTres - faixaDois)*desFaixaTres;
        System.out.print("Digite o sálario R$ ");
        salario = scan.nextDouble();

        if (salario <=faixaUm){
            descontoEmprego = desFaixaUm * salario;
        }else if (salario <= faixaDois){
            calcFaixaDois = (salario - faixaUm)*descFaixaDois;
            descontoEmprego = calUm + calcFaixaDois;
        }else if (salario <= faixaTres){
            calcFaixaTres = (salario - faixaDois)*desFaixaTres;
            descontoEmprego = calUm + calDois + calcFaixaTres;
        }else if (salario <=faixaQuatro){
            calFaixaQuatro = (salario - faixaTres)*desFaixaQuatro;
            descontoEmprego = calUm + calDois + calTres + calFaixaQuatro;
        }else {
            descontoEmprego = calUm + calDois + calTres + tetoMax;
        }
        System.out.printf("O salário bruto informado foi %.2f reais.%n" +
                "O valor de contribuição ao INSS é %.2f reais",salario,descontoEmprego);
    }
}
