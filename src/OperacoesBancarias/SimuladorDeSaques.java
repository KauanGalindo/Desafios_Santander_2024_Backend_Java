package OperacoesBancarias;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimuladorDeSaques {
        public static void main(String[] args) {

            System.out.println("\n=====SIMULAÇÃO BANCÁRIA=====\n");

            // Variáveis
            double saldo = 0;
            double deposito = 0;
            boolean continuar = false;

            // Loop para executar as operações bancárias
            while (!continuar) {
                try { // Tratar exceções

                    System.out.println("============================\n1[Depósito] 2[Saque]\n3[Saldo]    4[Sair]"); // Opções do programa
                    System.out.printf("\nEscolha a opção que deseja: ");
                    Scanner sc = new Scanner(System.in); // Scanner open
                    int opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.printf("============================\n[Depósito]\nDigite o valor que deseja depositar: ");
                            deposito = sc.nextDouble();
                            if (deposito <= 0)
                                System.out.println("Não é possível depositar");
                            else {
                                saldo += deposito;
                                System.out.println("Valor depositado com sucesso!");
                            }
                            break;
                        case 2:
                            System.out.printf("============================\n[Saque]\nDigite o valor que deseja sacar: ");
                            double valorDeSaque = sc.nextDouble();

                            if (valorDeSaque > saldo)
                                System.out.println("Saldo atual: " + saldo + ". Saldo insuficiente");
                            else if (valorDeSaque <= 0)
                                System.out.println("Impossível sacar.");
                            else {
                                saldo -= valorDeSaque;
                                System.out.println("Saque realizado com sucesso!");
                            }
                            break;
                        case 3:
                            System.out.println("============================\n[Saldo]\nSeu saldo atual é de: " + saldo);
                            break;
                        case 4:
                            continuar = true;
                            System.out.println("============================\nVocê saiu.\n============================\n");
                            break;
                        default: throw new InputMismatchException();
                    }
                    sc.nextLine(); // Limpa buffer
                } catch (InputMismatchException e) {
                    System.out.println("============================\nPor favor, escolha uma das opções disponíveis.");
                }
            }
        }
    }