import java.util.List;

public class Main {
    //adição de melhorias na API com os métodos() takeWhile e dropWhile()
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //o primeiro elemento do fluxo deve satisfazer o predicate, se um elemento não corresponder, o fluxo é encerrado, dorpWhile é o inverso disso
        numeros.stream().takeWhile(num -> num <= 5).forEach(System.out::println);
    }
}
