package main;

public class Main {
    public static void main(String[] args) {
        String diaDaSemana = "domingo";

        System.out.println(ehDiaUtil(diaDaSemana));
    }

    public static String ehDiaUtil(String dia) {

        //switch expression
        return switch (dia) {
            case "domingo", "sabado" -> "não";
            case "segunda", "terca", "quarta", "quinta", "sexta" -> "sim";
            default -> "dia invalido";
        };

    }
}

