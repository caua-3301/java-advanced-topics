package main;

public class Main {
    public static void main(String[] args) {
        //forma de adcinar controle sobre as heranças entre as classes
        Animal animal = new Gato();

        animal.emitirSom();
    }
}

abstract sealed class Animal permits Gato {
    public void emitirSom(){}
}

//indica que Gato nõ pode ser herdada
final class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("MIAUUUUUUUUUU");
    }
}
