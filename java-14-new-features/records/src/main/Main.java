package main;

public class Main {
    public static void main(String[] args) {
        //utilizado para objetos POJO (Plain Old Java Object)
        Retangulo retangulo = new Retangulo(5, 5);

        System.out.println(retangulo.altura() + retangulo.largura());
    }
}

record Retangulo(double largura, double altura) {}
