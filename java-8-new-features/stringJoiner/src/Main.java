import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        //stringJoiner é um 'oposto' dp tokenizer, segue o exemplo:

        /*String nomes = "Jordania, Isabell, Cibela, Larissa";

        StringTokenizer stringTokenizer = new StringTokenizer(nomes, ",");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        } */

        StringJoiner stringJoiner = new StringJoiner(",");

        //junta strings com base em um delimitador
        stringJoiner.add("João");
        stringJoiner.add("Maria");
        stringJoiner.add("Jose");

        System.out.println(stringJoiner);
    }
}
