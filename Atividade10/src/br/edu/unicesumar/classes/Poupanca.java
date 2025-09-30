package br.edu.unicesumar.classes;

public class Poupanca extends Conta {
    // CONSTRUTOR
    public Poupanca () {};

    public Poupanca (int numeroConta) {
        super(numeroConta);
    }

    // MÉTODOS
    @Override
    public void sacar () {
        System.out.println("Voce acabou de sacar 2000 da sua conta poupança.");
    }
}