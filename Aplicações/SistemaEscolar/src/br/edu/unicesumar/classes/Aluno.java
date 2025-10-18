package br.edu.unicesumar.classes;

public class Aluno extends Pessoa {
    private String ra;

    public Aluno () {}

    public Aluno (String nome, int idade, String ra) {
        super(nome, idade);
        this.ra = ra;
    }

    public String getRa () {
        return this.ra;
    }

    public void setRa (String ra) {
        this.ra = ra;
    }

    @Override
    public String showInfo () {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", RA: " + getRa();
    }
}
