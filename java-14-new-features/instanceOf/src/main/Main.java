package main;

public class Main {
    public static void main(String[] args) {
        //operador qeu verifica se um objeto é instância de uma classe em específico
        Animal animal = new Gato("Mike");

        //se for uma instancia de gato, ocorre um cast para a classe Gato
        if (animal instanceof Gato gato) {
            gato.mia();
        }
    }
}

class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public void mia() {
        System.out.println("Au au");
    }
}
