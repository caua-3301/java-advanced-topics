package main;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //retornsa um number format
         NumberFormat nf = CompactNumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.LONG);

         //exibe de forma personalizada com base no país(regiã informada)
        //saída: 500 mil
        System.out.println(nf.format(500000));
    }
}
