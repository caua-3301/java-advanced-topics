import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

//o pacote java.lang.reflec fornece métodos que permitem explorar informações sobre métodos e parametros de uma classe ou instancia
public class Main {
    public static void main(String[] args) {

        //instancia da classe produto
        Produto produto = new Produto("Geladeira");

        //instancia da classe Class
        Class clss = produto.getClass();

        //todos os métodos declarados na classe produto (method é do pacote reflect)
        Method[] methods = clss.getMethods();

        for (Method m : methods) {
            System.out.println(m.getName());

            //também do pacote reflect
            Parameter[] parameters = m.getParameters();

            //verificado todos os detalhes de todos os parametros de um método
            for (Parameter p : parameters) {
                System.out.println(p);
            }
        }
    }
}

class Produto {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome, String sla) {
        this.nome = nome;
    }
}
