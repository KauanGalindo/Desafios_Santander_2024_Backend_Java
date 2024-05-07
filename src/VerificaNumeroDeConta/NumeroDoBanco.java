package VerificaNumeroDeConta;
import java.util.Scanner;

public class NumeroDoBanco {

    public static void main(String[] args) {

        // Scanner open
        Scanner sc = new Scanner(System.in);

        // Tratando a exceção
        try {

            System.out.println("Insira o número da sua conta bancária:");
            String numeroConta = sc.nextLine();
            verificarNumeroConta(numeroConta); // Chama o método verificarNumeroConta
            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage()); // Exibi a mensagem de erro
        } finally {
            sc.close(); // Scanner close
        }
    }

    // Método Exceção costumizada
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8)
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
    }
}
