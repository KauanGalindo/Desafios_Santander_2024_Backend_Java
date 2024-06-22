package BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente pessoa1 = new Cliente();
        pessoa1.setNome("Pessoa1");

        Conta cc = new ContaCorrente(pessoa1);
        Conta poupanca = new ContaPoupanca(pessoa1);

        cc.depositar(200);
        cc.imprimirExtrato();
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}