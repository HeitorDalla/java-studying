package br.edu.unicesumar.classes;

public class User {

    //ENCAPSULANDO OS ATRIBUTOS
    private String email;
    private String password;
    private String name;

    //CONSTRUTOR COM TODAS AS INFORMAÇÕES
    public User(String email, String password, String name){
        this.email = email;
        this.password = password;
        this.name = name;
    }

    //CONSTRUTOR VAZIO
    public User(){}
    
    //DISPONIBILIZAÇÃO DO ATRIBUTO
    public String getEmail () {
        return this.email;
    }

    //INSERÇÃO DE VALORES PARA O ATRIBUTO
    public void setEmail (String email) {
        this.email = email;
    }

    public String getPassword (){
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
