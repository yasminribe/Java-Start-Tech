package estudo_JavaUtil;

import estudoPOO_herdado_conta.Cliente;
import estudoPOO_herdado_conta.Conta;
import estudoPOO_herdado_conta.ContaCorrente;
import estudoPOO_herdado_conta.ContaPoupanca;

public class TesteArraysReferencia {
    public static void main(String[] args) {

        //ContaCorrente [] contas = new ContaCorrente[5];// padrão de inicalização null

        /*----------------------------------------------------------------------------------
        E se quisermos inicializar um array capaz de armazenar qualquer tipo de referência?
         Precisaríamos do tipo mais genérico possível, neste caso, seria do tipo Object.
        -----------------------------------------------------------------------------------
        */

        Conta[] contas = new Conta[5];// padrão de inicalização null
        //----------------------------------------------------------------------------------
        Object[] contas1 = new Object[5];

        ContaCorrente cc = new ContaCorrente(111, 10254);
        ContaCorrente cc1 = new ContaCorrente(111, 110002);
        ContaPoupanca cc2 = new ContaPoupanca(1588, 2583);
        contas[0] = cc;
        contas[1] = cc1;
        contas[2] = cc2;

        System.out.println(contas[0].getNumero());
        System.out.println(cc1.getNumero());

        ContaCorrente refe = (ContaCorrente) contas[1]; //referencia do tipo conta corrente
        System.out.println(refe.getNumero());
        System.out.println(cc1.getNumero());
        //--------------------------------------------------------------------------------------
        Conta ref1 = contas[1];
        System.out.println(ref1.getNumero());
        //--------------------------------------------------------------------------------------
        ContaPoupanca ref = (ContaPoupanca) contas[2]; //type cast
        System.out.println(ref.getNumero());

        Cliente cliente = new Cliente();
        contas1[3] = cliente;

      /*
       Object referenciaGenerica = contas1[3];
        System.out.println(referenciaGenerica.getNumero);
        ----------------------------------------------------------------------------------------------------------
      * Parou de funcionar porque o tipo de referência no índice 3 é Object, e utilizamos esta referência
      * genérica para chamar o método getNumero(). Na classe Object existe este método? Não existe.
      * Por esse motivo, temos um erro de compilação.
      * Isso só funcionará se fizermos um cast, ou seja, se transformarmos uma referência genérica
      * em uma específica.
      * ---------------------------------------------------------------------------------------------------------
      *
      * */




        /*

            Fazemos isso por meio de um cast de referências. Transformamos uma referência de um tipo mais genérico,
             para uma de um tipo mais específico. Isso pode ser chamado também de type cast

        int numero = 3;
        double valor = numero; //cast implícito

        int num = 3;
        double v = (double) num; //cast explícito

        qualquer inteiro cabe dentro de um double. Por isso o compilador fica quieto e não exige um cast explicito,
        mas nada impede de escrever

        Agora, o contrário não funciona sem cast, uma vez que um double não cabe em um int
        double valor = 3.56;
        int numero = (int) valor; //cast explicito é exigido pelo compilador

        ---------------------------------------------------------------------------------------------------------
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
