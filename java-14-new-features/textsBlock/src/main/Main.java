package main;

public class Main {
    public static void main(String[] args) {

        //nessa versão do jdk, é permitido o uso do caractere de escape nos textsBlocks
        String str = """
        Olá mundo, \
        Java é fera demais
        Melhor que whey da growth 
        """;

        System.out.println(str);
    }
}
