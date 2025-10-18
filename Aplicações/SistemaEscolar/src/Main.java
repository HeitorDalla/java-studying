import java.util.Scanner;

import br.edu.unicesumar.classes.Aluno;
import br.edu.unicesumar.classes.Professora;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Avaliação de notas ---");

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setIdade(idade);

        System.out.println("BEM VINDO!!!!");

        System.out.println("Deseja adicionar quantas notas para avaliação? ");
        int quantidadeNotas = sc.nextInt();

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Digite sua nota: ");
            int nota = sc.nextInt();

            aluno.addGrade(nota);
        }

        Professora professora = new Professora();
        professora.setNome("Larissa");
        professora.setIdade(70);

        professora.evaluateStudent(aluno);
        

        System.out.println("No momento, tem: " + Aluno.getCount() + " objetos instanciados");
    }
}