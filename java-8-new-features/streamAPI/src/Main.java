import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Geladeira", 2500.0));
        produtos.add(new Produto("Iphone", 6100.0));
        produtos.add(new Produto("Bicicleta", 1400.0));
        produtos.add(new Produto("Mesa", 750.0));

        //usando o Stream (fluxo de dados que são operados com functional interfaces) para gerar uma nova lista

        List<Produto> produtosSelecionados = produtos.stream().filter(prod -> prod.getPreco() >= 2000).sorted(Comparator.comparing(Produto::getPreco)).collect(Collectors.toList());

        produtosSelecionados.forEach(System.out::println);
    }
}

class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
