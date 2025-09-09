package br.edu.unicesumar.classes;

public class Tecnico extends Assistente {
    // CRIANDO VARIAVEIS
    private double bonusSalarial;

    // CONSTRUTOR VAZIO
    public Tecnico(){}

    // CONSTRUTOR COM TODAS AS INFORMAÇÕES
    public Tecnico (String nome, double salario, String matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    // CONSTRUIR GET E SET APENAS DA CLASSE FILHA
    public void setBonusSalarial (double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial () {
        return this.bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return (getSalario() * 12) + this.bonusSalarial;
    }
}