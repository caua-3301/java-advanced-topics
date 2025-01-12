
//base64 é um codificador de dados binários

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.BitSet;
import java.util.List;

//os dados binários são divididos em blocos de 3 bytes (24bits); esses blocos são convertidos em 4 caracteres, cada um representando 6 bits
public class Main {
    public static void main(String[] args) {

        //codificando uma string (na verdade, os bytes da string)
        String mainStr = "Hello, World!";

        String mainStrCodificadaEmBase64 = "";
        String mainStrcDecodificadaEmBase64 = "";

        //bytes da string
        byte[] bytes = mainStr.getBytes(StandardCharsets.UTF_8);
        //codificando
        mainStrCodificadaEmBase64 = Base64.getEncoder().encodeToString(bytes);

        //decodificando
        mainStrcDecodificadaEmBase64 = new String(Base64.getDecoder().decode(mainStrCodificadaEmBase64), StandardCharsets.UTF_8);

        System.out.println(mainStrCodificadaEmBase64);
        System.out.println(mainStrcDecodificadaEmBase64);

    }
}
