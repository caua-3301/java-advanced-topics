//criando uma interface funcional personalizada
interface Calculadora {
    void calc();
}

// LAMBDA  () -> {}
public class Main {
    public static void main(String[] args) {

        //sem lambada
        Thread threadOne = new Thread(new Runnable() {
            //sobrescrica de interface funcional de forma explícita
            @Override
            public void run() {
                System.out.println("Hello, world from threadOne");
            }
        });

        threadOne.start();

        //com lambda
        Thread threadTwo = new Thread(() -> System.out.println("Hello, world from threadTwo"));

        threadTwo.start();

        //exemplo com interface funcional personalizada ==================

        //sem lambda
        Calculadora calculadoraA = new Calculadora() {
            @Override
            public void calc() {
                System.out.println("Calculating");
            }
        };

        calculadoraA.calc();

        //com lambda
        Calculadora calculadoraB = () -> System.out.println("Calculating again");

        calculadoraB.calc();
    }
}
