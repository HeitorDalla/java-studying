package br.edu.unicesumar.classes;

public class Corrente extends Conta {
    // CONSTRUTOR
    public Corrente () {};
    
    public Corrente (int numeroConta) {
        super(numeroConta);
    }

    // MÉTODOS
    @Override
    public void sacar () {
        System.out.println("Voce acabou de sacar R$1000 da conta corrente!!");
    }
}