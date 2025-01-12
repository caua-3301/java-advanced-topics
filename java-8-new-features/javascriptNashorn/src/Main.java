import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

//forma de executar comandos JavaScript
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ScriptException {
        //para rodar, temos o motor jjs na JVM e a interface ScriptEngine

        //Nashorn é o motor de interpretaçãoi de JS da JVM
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");

        Bindings bind = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE);

        scriptEngine.eval(new FileReader("./index.js"));
    }
}
