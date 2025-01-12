import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayone = {1, 6, 4, 7, 4, -4, 23, -12, 5};

        for (int numb : arrayone) {
            System.out.print(numb + " ");
        }

        System.out.println();

        //aplicação do método com ordenação; pode receber mais dois poaramentros, o indice de inicio de ordenação e o final
        Arrays.parallelSort(arrayone);

        for (int numb : arrayone) {
            System.out.print(numb + " ");
        }
    }
}
