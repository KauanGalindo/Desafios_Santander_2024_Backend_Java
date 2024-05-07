package ControleDeSaques;
import java.util.Scanner;

public class ControleSimplesDeSaque {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in); // Scanner open

        // Variaveis
        double limiteDiario;
        double valorSaque;

        System.out.printf("Defina o valor limite de saque diário: ");
        limiteDiario = sc.nextDouble();

        for (int i = 0; i < limiteDiario; i++) {

            System.out.printf("Insira o valor que deseja sacar: ");
            valorSaque = sc.nextDouble();

            // Condições
            if (valorSaque <= 0 ){
                System.out.println("Transacoes encerradas.");
                limiteDiario = -1;
            }
            else if (valorSaque <= limiteDiario){
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
            else{
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                limiteDiario = -1;
            }
        }
        sc.close(); // Scanner close
    }

}
