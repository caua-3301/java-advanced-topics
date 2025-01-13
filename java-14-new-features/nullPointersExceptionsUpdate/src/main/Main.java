package main;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = null;
        //o log de erro é mais claro, facilitando a depuração
        aluno.getNome();

    }
}

class Aluno {
    private String nome;

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
