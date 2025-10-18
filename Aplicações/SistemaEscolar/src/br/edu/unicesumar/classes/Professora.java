package br.edu.unicesumar.classes;

public class Professora extends Pessoa {
    private String cargaHoraria;

    public Professora () {}

    public Professora (String nome, int idade, String cargaHoraria) {
        super(nome, idade);
        this.cargaHoraria = cargaHoraria;
    }

    public String getCargaHoraria () {
        return this.cargaHoraria;
    }

    public void setCargaHoraria (String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String showInfo () {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Carga horaria: " + getCargaHoraria();
    }
}
