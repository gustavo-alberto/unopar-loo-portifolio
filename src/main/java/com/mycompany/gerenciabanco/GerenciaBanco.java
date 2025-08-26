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
    
}

public class GerenciaBanco {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
