
// METHOD REFERENCE Class::method
public class Main {

    public static void main(String[] args) {
        Calculadora calculadoraOne = () -> System.out.println("Calculating default");

        calculadoraOne.calc();

        //objeto para ser referenciado
        Smartphone smartphone = new Smartphone();

        //aplicação do method referenc (por ser um interface funcional, seu único método faz referencia a smartphone -> calculate)
        Calculadora calculadoraTwo = smartphone::calculate;

        calculadoraTwo.calc();

        //REFERÊNCIA DE UM MÉTOD STATIC
        //listaQualquer.stream.map(Printer::printer).toList()

        //Ainda é possível fazer referencia a métodos não estáticos, desde que, a classe do tipo T com o método seja do mesmo tipo T de uma lista

        //Uma outra forma é Classe::new class
    }
}

interface Calculadora {
    void calc();
}

class Printer {
    static void printer(String toPrint) {
        System.out.println(toPrint);
    }
}

class Smartphone {
    void calculate() {
        System.out.println("Calculating with smartphone");
    }
}
