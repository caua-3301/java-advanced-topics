# Java Adavanced Topics

Este repositório documenta os principais recursos introduzidos em cada versão do Java a partir da 8. 

## Java 8

A versão 8 foi uma das atualizações mais significativas do Java, trazendo melhorias na produtividade do desenvolvedor, funcionalidade e desempenho.

## Recursos Principais

### 1. **Annotations**
   - Expansão do suporte a anotações para outros contextos, como parâmetros de métodos, e a introdução de `@Repeatable` para permitir anotações repetidas.

### 2. **Base64**
   - Introdução da classe `java.util.Base64` para codificar e decodificar dados no formato Base64 de maneira nativa.

### 3. **Functional Interfaces**
   - Interfaces com um único método abstrato, usadas como alvos para expressões lambda. Exemplos: `Runnable`, `Callable`, `Predicate`, e `Consumer`.

### 4. **JS Nashorn**
   - Um motor JavaScript para executar códigos JavaScript dentro de aplicações Java, substituindo o Rhino.

### 5. **Lambda Expressions**
   - Funções anônimas para simplificar a implementação de interfaces funcionais e tornar o código mais conciso.
   - Exemplo:
     ```java
     List<String> names = Arrays.asList("Ana", "Bruno", "Carlos");
     names.forEach(name -> System.out.println(name));
     ```

### 6. **Method References**
   - Sintaxe compacta para referenciar métodos existentes. Exemplo:
     ```java
     names.forEach(System.out::println);
     ```

### 7. **Optional**
   - Uma classe container para lidar com valores potencialmente nulos de forma segura.
   - Exemplo:
     ```java
     Optional<String> name = Optional.ofNullable(getName());
     name.ifPresent(System.out::println);
     ```

### 8. **Parallel Array Sorting**
   - Método `Arrays.parallelSort` para realizar ordenação paralela, melhorando o desempenho em arrays grandes.

### 9. **Reflect Package**
   - Melhorias no pacote `java.lang.reflect`, permitindo inspecionar e manipular código em tempo de execução de forma mais eficiente.

### 10. **Stream API**
   - Introdução da API de Streams para manipulação de coleções de dados de forma declarativa e paralela.
   - Exemplo:
     ```java
     List<String> filtered = names.stream()
                                 .filter(name -> name.startsWith("A"))
                                 .collect(Collectors.toList());
     ```

### 11. **StringJoiner and StringTokenizer**
   - `StringJoiner`: Facilita a construção de strings concatenadas com delimitadores personalizados.
     ```java
     StringJoiner joiner = new StringJoiner(", ");
     joiner.add("Java").add("Python").add("C++");
     System.out.println(joiner);
     ```
   - Melhorias no `StringTokenizer` para processamento de strings com tokens.

### 12. **Type Inference**
   - Melhorias no mecanismo de inferência de tipo em expressões genéricas, reduzindo a verbosidade do código.

---

## Repositório
Junto a esse README, o repositório possui diversos exemplos sobre cada tópico listado.

---

