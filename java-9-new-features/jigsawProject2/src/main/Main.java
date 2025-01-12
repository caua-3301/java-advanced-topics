package main;

import bye.Bye;
import hello.Hello;

public class Main {
    public static void main(String[] args) {
        //implementando métodos importados do pacote
        Hello hello = new Hello();
        hello.say();

        Bye bye = new Bye();
        bye.say();
    }
}
