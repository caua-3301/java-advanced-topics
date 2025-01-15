package main;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        //o log de erro para NullPointersExceptions está mais informativo do que nas ultimas versões
        System.out.println(aluno.getNome().toLowerCase());

        /*
        * log do erro:
        *
        * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because the return value of "main.Aluno.getNome()" is null
	    * at main.Main.main(Main.java:7)
        * */
    }
}


class Aluno {
    private String nome = null;

    public Aluno() {}

    public String getNome() {
        return nome;
    }
}