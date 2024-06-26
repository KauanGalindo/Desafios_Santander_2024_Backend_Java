package DesafioControleFluxo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        System.out.println("\n========CONTADOR DE 2 PARÂMETROS========\n");

        // Variáveis
        int primeiroNumero;
        int segundoNumero;
        boolean inputValido = false;

        // Scanner Open
        Scanner sc = new Scanner(System.in);

        // Loop para tratar exceção
        while (!inputValido) {
            try {

                // Entrada dos valores
                System.out.printf("Insira o primerio número: ");
                primeiroNumero = sc.nextInt();
                System.out.printf("Insira o segundo número: ");
                segundoNumero = sc.nextInt();

                // Condição
                if (primeiroNumero > segundoNumero)
                    System.out.println("========================================\n" +
                            "Lembre-se que o primerio número deve ser menor que o segundo." +
                            "\n========================================");
                else if (primeiroNumero < 0 || segundoNumero < 0)
                    System.out.println("========================================\n" +
                            "Por favor, insira um número positivo maior que zero.\n" +
                            "Primeiro número sempre menor que o segundo." +
                            "\n========================================");
                else if (primeiroNumero == segundoNumero)
                    System.out.println("========================================\n" +
                            "Números iguais.\nInsira números diferentes com o primeiro número sempre menor que o segundo." +
                            "\n========================================");
                else {
                    inputValido = true;
                    for (int i = primeiroNumero + 1 ; i <= segundoNumero; i++) {
                        System.out.println("Imprimindo o número: " + i);
                    }
                    System.out.println("========================================" +
                            "\nTotal de números exibidos: " + (segundoNumero - primeiroNumero) +
                            "\n========================================");
                    // Scanner Close
                    sc.close();
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira números!.");
                sc.nextLine();
            } catch (ParametrosInvalidosException e) {
                System.out.println("Lembre-se que o primerio número deve ser menor que o segundo.");
                sc.nextLine();

            }
        }
    }
}