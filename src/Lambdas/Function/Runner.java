package Lambdas.Function;

import java.util.function.Function;

public class Runner {
    public static void main(String[] args) {
        String type = "upper";
        decidePrinter(type).apply("Tantia Tope");


        // The benefit of this is that we can pass functions around as arguments
        Function<String, String> normalPrinter = text -> {
            System.out.println("To Print: " + text);
            return text;
        };
        Function<String, String> upperCasePrinter = text -> {
            System.out.println("To Print(uppercase): " + text);
            return text.toUpperCase();
        };

        System.out.println(execute("Tantia", normalPrinter));
        System.out.println(execute("Tantia", upperCasePrinter));
    }

    private static Function<String, String> decidePrinter(String type) {
        switch (type) {
            case "lower": return Runner::printLower;
            case "normal": return Runner::printNormal;
            case "upper": return Runner::printUpper;
        }
        return null;
    }

    private static String printNormal(String text) {
        System.out.println(text);
        return text;
    }

    private static String printUpper(String text) {
        System.out.println(text.toUpperCase());
        return text;
    }

    private static String printLower(String text) {
        System.out.println(text.toLowerCase());
        return text;
    }

    private static String execute(String text, Function<String, String> function) {
        return function.apply(text);
    }
}
