package estudoObjteos_ByteBank;

import estudoOrientacaoAObjeto.Conta;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaMarcela = new Conta();

        // contaMarcela.titula.nome= "Marcela Travel"; Da execação não complila pois esta nullpointerException
        contaMarcela.titula = new Cliente();
        contaMarcela.titula.nome = "Marcela Travel";
        System.out.println(contaMarcela.titula.nome);
    }
}
