package main;

import jdk.incubator.foreign.SymbolLookup;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

public class Main {
    public static void main(String[] args) {
        //FORMA DE USAR MÉTODOS EXTRANGEIROS (OUTRAS LINGUAGENS, COMO C)

        //LINKER PARA O FUNÇÃO ESTRANGEIRA
        Linker linker = Linker.nativeLinker();
        SymbolLookup stdlib = linker.defaultLookup();

        //RESERVA UM SEGMENTO DE MEMÓRIA PARA O MÉTODO strlen do pacote stdlib
        MemorySegment strlenAdress = stdlib.find("strlen").orElseThrow();

        //DEFINIÇÃO DOS ARGUMENTOS DE ENTRADA E SAÍDA
        FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        MethodHandle strlen = linker.downcallHandle(strlenAdress, descriptor);

        //GERNECIAMENTO DE MEMORIA
        try (Arena offHeap = Arena.ofConfined()) {
            MemorySegment funcArg = offHeap.allocateUtf8String("OLA, MUNDO");

            long length = (long) strlen.invoke(funcArg);

            System.out.println(length);
        } catch (Throwable err) {
            err.printStackTrace();
        }
    }
}
