package com.mycompany.gerenciabanco;

import java.util.Scanner;

/**
 * Represents a simple bank account with basic operations: deposit, withdraw,
 * check balance, and interactive menu.
 */
class BankAccount {

    // Account holder's first name
    public String firstName;

    // Account holder's last name
    public String lastName;

    // Account holder's CPF (Brazilian individual taxpayer registry identification)
    public String cpf;

    // Account balance
    public double balance;

    /**
     * Creates a new bank account with zero balance.
     *
     * @param firstName Account holder's first name
     * @param lastName Account holder's last name
     * @param cpf Account holder's CPF
     */
    public BankAccount(String firstName, String lastName, String cpf) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        this.balance = 0.0;
    }

    /**
     * Returns the current account balance.
     *
     * @return current balance
     */
    public double checkBalance() {
        return balance;
    }

    /**
     * Deposits a given amount into the account.
     *
     * @param amount value to deposit
     */
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depósito de R$" + amount + " realizado com sucesso.");
    }

    /**
     * Withdraws a given amount if sufficient funds are available.
     *
     * @param amount value to withdraw
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Saque de R$" + amount + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    /**
     * Displays an interactive menu for the user to choose banking operations
     * until they decide to exit.
     */
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Display available options
            System.out.println("\n------Menu------");
            System.out.println("1. Consultar Saldo.");
            System.out.println("2. Depositar.");
            System.out.println("3. Sacar.");
            System.out.println("4. Encerrar.");
            System.out.println("Escolha uma opção:");

            option = scanner.nextInt();

            // Handle user choice
            switch (option) {
                case 1:
                    System.out.println("Saldo: R$" + checkBalance());
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito:");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja sacar:");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (option != 4);

        scanner.close();
    }
}

/**
 * Main application class for the bank management system. Creates a new account
 * and starts the menu interaction.
 */
public class GerenciaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user information
        System.out.println("Seja bem-vindo ao sistema bancário.");
        System.out.println("Qual o seu nome?");
        String firstName = scanner.nextLine();

        System.out.println("Qual o seu sobrenome?");
        String lastName = scanner.nextLine();

        System.out.println("Qual o seu CPF?");
        String cpf = scanner.nextLine();

        // Create new account with provided details
        BankAccount account = new BankAccount(firstName, lastName, cpf);

        // Show menu for banking operations
        account.showMenu();

        System.out.println("Muito obrigado!");
        scanner.close();
    }
}
