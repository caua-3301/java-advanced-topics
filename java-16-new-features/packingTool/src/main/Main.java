package main;

public class Main {
    //arquivo que será empacotado para um .jar
    public static void main(String[] args) {
        String output =  """
                        Java é a melhor linguagem de programação, pois:
                        -> Spring Framework;
                        -> OO no sangue;
                        -> Robustez e segurança;
                        -> Elegante.
                        
                        Quer mais?
                        """;

        System.out.println(output);
    }
}
