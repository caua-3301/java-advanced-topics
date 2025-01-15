package main;

public class Main {
    public static void main(String[] args) {
        //a partir do java 16, os contrutores públicos de wrapper classes estão anotados como decrapted, o objetivo é tornar essas classes tipos primitivos
        //exemplo

        //essa anotação permite a execulção do código
        @SuppressWarnings("removal")
        Integer numero = new Integer(10);
    }
}
