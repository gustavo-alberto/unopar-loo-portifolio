package com.mycompany.gerenciabanco;

import java.util.Scanner;

class BankAccount {

    public String firstName;
    public String lastName;
    public String cpf;
    public double balance;

    public BankAccount(String firstName, String lastName, String cpf) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        this.balance = 0.0;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depósito de R$" + amount + " realizado com sucesso.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Saque de R$" + amount + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n------Menu------");
            System.out.println("1. Consultar Saldo.");
            System.out.println("2. Depositar.");
            System.out.println("3. Sacar.");
            System.out.println("4. Encerrar.");
            System.out.println("Escolha uma opção:");
            option = scanner.nextInt();

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

public class GerenciaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao sistema bancário.");
        System.out.println("Qual o seu nome?");
        String firstName = scanner.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String lastName = scanner.nextLine();
        System.out.println("Qual o seu CPF?");
        String cpf = scanner.nextLine();

        BankAccount account = new BankAccount(firstName, lastName, cpf);
        account.showMenu();

        System.out.println("Muito obrigado!");
        scanner.close();
    }
}
