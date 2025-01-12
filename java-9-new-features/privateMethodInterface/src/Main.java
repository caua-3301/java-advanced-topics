public class Main {
    public static void main(String[] args) {
        ImplementInterface implementInterface = new ImplementInterface();

        implementInterface.print("Hello, my name is Cauã");
        implementInterface.print("Hy");
    }
}

//demonstração

interface Example {
    //quando privado, a implementação é obrigatória
    private String validator(String msg) {
        return msg.length() > 10 ? msg : "Invalid Message";
    };

    default void print(String msg) {
        System.out.println(validator(msg));
    };
}

//nesse caso, não consigo acessa o método show, consigo apenas chamá-lo na propria interface
class ImplementInterface implements Example {
}
