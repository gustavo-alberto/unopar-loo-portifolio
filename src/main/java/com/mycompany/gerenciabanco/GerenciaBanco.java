package com.mycompany.gerenciabanco;


class ContaBancaria {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;
    
    public ContaBancaria(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
    
    public double consultarSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ + " + valor + "realizado com sucesso.");
    }
    
    public void sacar(double valor) {
        if (saldo>=valor) {
            saldo -=valor;
            System.out.println("Saque de R$" + valor + "realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}

public class GerenciaBanco {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
