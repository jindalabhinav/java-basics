package Lambdas.Math;

public class Runner {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> {
            return a + b;
        };
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiple = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(5,4));
        System.out.println("Subtraction: " + subtract.operate(5,4));
        System.out.println("Multiple: " + multiple.operate(5,4));

        MathOperation divide = (a, b) -> {
            if (b == 0)
                return 0;
            return a / b;
        };

        System.out.println("Division: " + divide.operate(5, 4));
        System.out.println("Division: " + calculate(5, 4, divide));
    }

    private static int calculate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
