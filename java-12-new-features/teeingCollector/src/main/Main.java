package main;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //recebe dois collectors e retorna uma BiFunction (Funções (interface) com dois argumentos)

        //soma = colector 1, qntd = collector 2, media = BiFunction
        //Collectors.teeing(soma, qntd, media);

        double resultado = Stream.of(10, 20, 30, 40, 50, 10).collect(Collectors.teeing(
                Collectors.summingDouble(n -> n),
                Collectors.counting(),
                (soma, qntd) -> soma/qntd));

        System.out.println(resultado);
    }
}
