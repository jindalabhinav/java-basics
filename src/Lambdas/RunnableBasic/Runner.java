package Lambdas.RunnableBasic;

public class Runner {
    public static void main(String[] args) {
        Runnable printer = new Printer();
        Thread thread = new Thread(printer);

        thread.start();
    }
}
