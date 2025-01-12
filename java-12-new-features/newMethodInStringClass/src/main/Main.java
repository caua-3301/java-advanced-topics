package main;

public class Main {
    public static void main(String[] args) {
        String str1 = "java fera demais";

        //============= indent(n)
        //adiciona n espacos brancos no inicio
        str1 = str1.indent(5);
        System.out.println(str1);

        //removendo todos
        str1 = str1.indent(-5);
        System.out.println(str1);

        //============= transform(lambda)
        String str2 = "Hello, World";

        //modifica a String (é o parametro da lambda expression)
        String retorno = str2.transform(str -> str + "a");

        System.out.println(retorno);
    }
}
