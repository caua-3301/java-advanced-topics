package main;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = new File("output.txt").toPath();
        String text = "Hello, Java!";

        //existem algums formas de escrever em arquivos, como o FileReader/Write, e o BufferedReader/Write
        //Exemplo com os novos métodos

        //recebe o path (Tipo path) e o texto
        Files.writeString(path, text, StandardCharsets.ISO_8859_1);


        //de forma similar a writer, existem muitos métods para fazê-lo. Fazendo com o novo métod com stringWrite ->
        String response = Files.readString(path, StandardCharsets.ISO_8859_1);

        System.out.println(response);
    }
}
