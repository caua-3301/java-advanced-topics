import java.util.List;
import java.util.Queue;

//forma de instanciar uma Class do tipo Collection com um método estático
public class Main {
    public static void main(String[] args) {

        //exemplo com list, mas poderia ser com Set ou Map
        //of que é a "factory method"
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        numeros.forEach(System.out::print);
    }
}
