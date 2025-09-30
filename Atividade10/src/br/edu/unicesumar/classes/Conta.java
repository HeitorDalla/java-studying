package br.edu.unicesumar.classes;

public abstract class Conta {
    // ATRIBUTO CONCRETO (COMUM A TODOS)
    protected int numeroConta;

    // CONSTRUTOR
    public Conta () {}

    public Conta (int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // MÉTODOS GET E SET
    public int getNumeroConta () {
        return this.numeroConta;
    }

    public void setNumeroConta (int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // MÉTODO ABSTRATO - OBRIGA AS CLASSES FILHAS IMPLEMENTAREM A LOÓGICA, 
    // POIS É DIFERENTE PARA CADA TIPO
    public abstract void sacar ();
}