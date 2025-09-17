package br.unicesumar.edu.classes;

import java.util.Scanner;

public class User {

    private String firstName;
    private String lastName;
    private int age;

    public User () {}

    public User(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void cadastrarUser() throws Exception{

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o nome do usuário:");
        this.firstName = s.nextLine();
        System.out.println("Informe o sobrenome do usuário:");
        this.lastName = s.nextLine();
        System.out.println("Informe a idade do usuário:");
        this.age = s.nextInt();
    }

    @Override
    public String toString(){
        return this.firstName + " "
            + this.lastName + " - " 
            + this.age;
    }
}
