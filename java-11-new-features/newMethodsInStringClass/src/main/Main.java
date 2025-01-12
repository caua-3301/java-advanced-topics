package main;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str1 = "         ";
        String str2 = "";
        String str3 = "Java is the best language to programming";

        //verifica se uma string é vazia, retorna um boolean
        System.out.println(str1.isBlank());

        String str4 = "Java\nTópicos\nAvançados";

        //quebra em linhas e retorna um fluxo de dados que pode ser coletado como uma Lista
        System.out.println(str4.lines().collect(Collectors.toList()));

        //repete a string (concatenado ela n vezes)
        String str5 = str3.repeat(3);

        System.out.println(str5);
    }
}
