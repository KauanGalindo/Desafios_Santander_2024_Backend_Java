import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        // Introdução
        System.out.println("\n=============CONTA BANCÁRIA=============\n");
        System.out.println("Nós da K@G agradecemos por nos escolher.\nJuntos podemos muito!.\n");

        // Instância da classe ContaTerminal
        ContaTerminal cliente1 = new ContaTerminal();

        // Scanner open
        Scanner sc = new Scanner(System.in);

        // Tratamento de exceção
        try {
            // Atribui valor as variáveis
            System.out.printf("Por favor, insira o seu nome: ");
            cliente1.setNomeCliente(sc.next());
            System.out.printf(cliente1.getNomeCliente() + ", insira a sua agência (Sem Hífen): ");
            cliente1.setNumeroDaAgencia(sc.next());
            System.out.printf("Insira o número da sua conta: ");
            cliente1.setNumeroDaConta(sc.nextInt());
            System.out.printf("Estamos quase finalizando, insira o seu saldo: ");
            cliente1.setSaldo(sc.nextDouble());

            // Exibe os valores das variáveis
            System.out.println("========================================");
            cliente1.exibeTextoSobreContaBancariaDoUsuario();

            // Scanner close
            sc.close();
        } catch (Exception e) {
            System.out.println("Por favor, insira um valor numérico nos campos: Conta, Agência, Saldo.");
        }
    }
}