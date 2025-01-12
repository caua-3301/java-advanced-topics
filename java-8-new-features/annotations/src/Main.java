import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Main {
    //a partir do java 8 as anotações podem ser utilizadas em diversos locais do código
    public static void main(String[] args) {
        Voltagem[] volts = Eletronico.class.getAnnotationsByType(Voltagem.class);

        for (Voltagem volt : volts) {
            System.out.println(volt);
        }
    }
}

//o uso de duas anotações foram permitidos a partir do Java 8
@Voltagem(tensao = "220")
@Voltagem(tensao = "110")
class Eletronico {
    private String nome;

}

//informando que pode repeti-las
@Repeatable(Voltagens.class)
@interface Voltagem {
    String tensao();
}

//container de voltage,
@Retention(RetentionPolicy.RUNTIME)
@interface Voltagens {
    Voltagem[] value();
}