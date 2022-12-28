package estudoByteBank;


import estudoOrientacaoAObjeto.Conta;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.nome = "Pedro Sousa";
        pedro.cpf =" 231 .255. 635-88";
        pedro.Profissao = "Dentista";

        Conta contaSousa = new Conta();
        //associa o clinte Pedro a conta contasousa
        contaSousa.titula = pedro;
        contaSousa.deposita(100);
        System.out.println(contaSousa.titula.nome);

    }
}
