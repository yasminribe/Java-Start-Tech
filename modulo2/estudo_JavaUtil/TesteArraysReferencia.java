package estudo_JavaUtil;

import estudoPOO_herdado_conta.ContaCorrente;

public class TesteArraysReferencia {
    public static void main(String[] args) {

        ContaCorrente [] contas = new ContaCorrente[5];// padrão de inicalização null
        ContaCorrente cc = new ContaCorrente(111,10254);
        ContaCorrente cc1 = new ContaCorrente(111,110002);
        contas[0]= cc;
        contas[1]= cc1;

        System.out.println(contas[0].getNumero());
        System.out.println(cc1.getNumero());

        ContaCorrente ref = contas[1];
        System.out.println(ref.getNumero());

        /*
        * Estamos acessando o contas[1] e, em contrapartida, nos será devolvido um valor, que é uma referência.
        * o tipo da variável é ContaCorrente. Assim, nosso retorno é uma referência do tipo ContaCorrente
        *
        * ----------------------------------------------------------------------------------------------------
        *
        * Um array é uma estrutura de dados e serve para guardar elementos (valores primitivos ou referências)
        * Arrays usam colchetes ([]) sintaticamente
        * Arrays têm um tamanho fixo!
        * Um array também é um objeto!
        * Arrays são zero-based (o primeiro elemento se encontra na posição 0)
        * Um array é sempre inicializado com os valores padrões.
        *
        *
        * */

    }
}
