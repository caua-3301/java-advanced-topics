package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("example1.txt");
        File file2 = new File("example2.txt");

        //compara dois arquivos e retorna o número do primeiro byte em que existe uma diferença, caso seja igual, retorna -1
        long result = Files.mismatch(file1.toPath(), file2.toPath());

        System.out.println(result);
    }
}
