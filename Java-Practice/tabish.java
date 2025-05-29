import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class tabish {
    public static void main(String[] args) {
        // Create a JavaScript engine (part of Java Scripting API)
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        // Define the initial behavior
        String code = "function compute(x) { return x * 2; }; compute(5);";

        try {
            // Evaluate the initial code
            Object result = engine.eval(code);
            System.out.println("Result of initial code: " + result);

            // Modify the code dynamically
            code = "function compute(x) { return x * x; }; compute(5);";
            result = engine.eval(code);
            System.out.println("Result of modified code: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
