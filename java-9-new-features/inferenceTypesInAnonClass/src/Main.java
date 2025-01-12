public class Main {
    public static void main(String[] args) {

        //classe internar anonima
        SumAll<Integer> sum = new SumAll<Integer>() {
            @Override
            public Integer soma(Integer a, Integer b) {
                return a + b;
            }
        };

        //inferencia de tipo ->

        /*
        //classe internar anonima, remover o tipo Integer na instanciação
        SumAll<Integer> sum = new SumAll<>() {
            @Override
            public Integer soma(Integer a, Integer b) {
                return a + b;
            }
        };*/
    }
}

interface SumAll<T> {

    public T soma(T a, T b);
}
