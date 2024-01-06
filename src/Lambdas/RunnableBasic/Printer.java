package Lambdas.RunnableBasic;

public class Printer implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello world! from thread: " + Thread.currentThread().getName());
    }
}
