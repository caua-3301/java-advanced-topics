package main;

public class Main {
    public static void main(String[] args) {
        Object obj = Integer.valueOf(10);

        //instanceof implícito, uso de null, uso de lambada e yield nos retornos
        String str = switch (obj) {
            case Integer i -> "is a Integer";
            case Double d -> "is a Double";
            case String s -> "is a String";
            case null -> "is a null object";
            default -> {
                System.out.println("not identify");
                yield "is a Object";
            }
        };

        System.out.println(str);
    }
}
