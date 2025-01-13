package main;

public class Main {
    public static void main(String[] args) {
        //exemplo sem textBlock
        String str = "olá\n" +
                "mundo";

        //exemplo com textBlock
        String strBlock = """
                Olá
                Mundo
                """;

        System.out.println(str);
        System.out.println(strBlock);
    }
}
