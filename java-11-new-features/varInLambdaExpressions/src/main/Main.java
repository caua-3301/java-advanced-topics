package main;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //antes
        Function<String, String> concatena = (String str) -> str + "!";

        //depois
        Function<String, String> concateneNew = (var str) -> str + "!";


    }
}
