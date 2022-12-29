package banco;

public class Main {
    public static void main(String[] args) {
        ContaBanco cliente1 = new ContaBanco();
        cliente1.setNumconta(1025);
        cliente1.setDono("Douglas Garcia");
        cliente1.abrirConta("CC");
        cliente1.depositar(300);
        cliente1.sacar(350);
        cliente1.fecharConta();
        cliente1.estadoAtual();

        ContaBanco cliente2 = new ContaBanco();
        cliente2.setNumconta(2015);
        cliente2.setDono("Maria Cleusa");
        cliente2.abrirConta("PP");
        cliente2.depositar(600);
        cliente2.sacar(200);
        cliente2.estadoAtual();
    }
}
