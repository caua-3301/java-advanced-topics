package main;


public class Main {
    public static void main(String[] args) {

    }

    public String ehUtil(String dia) {
        return switch (dia) {
            case "sabado", "domingo": yield  "nao";
            case "segunta", "terca", "quarta", "quinta", "sexta": yield "sim";
            default:
                throw new IllegalStateException("Unexpected value: " + dia);
        };
    }
}
