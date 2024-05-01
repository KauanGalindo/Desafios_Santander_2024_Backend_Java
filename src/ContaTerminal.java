public class ContaTerminal {

    // Atributos da classe
    private String nomeCliente;
    private String numeroDaAgencia;
    private int numeroDaConta;
    private double saldo;

    // Construtor
    public ContaTerminal (){

    }

    // Getter e Setters
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNumeroDaAgencia(String numeroDaAgencia) {
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public String getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método exibe as informações inseridas pelo usuário
    public void informaçõesDoUsuario() {
        System.out.println("Informações:\n====================================");
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Agência: " + getNumeroDaAgencia());
        System.out.println("Conta: " + getNumeroDaConta());
        System.out.println("Saldo: " + getSaldo());
    }

    public void exibeTextoSobreContaBancariaDoUsuario () {
        System.out.println("Olá " +getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " +getNumeroDaAgencia() +
                ", conta " +getNumeroDaConta() + " e seu saldo " +getSaldo() + " já está disponível para saque");
    }


}
