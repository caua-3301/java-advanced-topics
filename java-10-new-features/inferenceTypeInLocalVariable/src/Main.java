import java.util.List;

public class Main {
    public static void main(String[] args) {
        //inferindo o tipo (o compilador cuidará de definir ele)
        //deve ser iniciada, sempre
        var variavel1 = "Jose";
        var variavel2 = 4;

        var frutas = List.of("Manga", "Banana", "Beterraba");

        System.out.println(variavel1.length() + variavel2);

        frutas.forEach(System.out::println);
    }
}
