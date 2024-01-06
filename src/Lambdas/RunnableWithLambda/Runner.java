package Lambdas.RunnableWithLambda;

import lombok.SneakyThrows;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {
    @SneakyThrows
    public static void main(String[] args) {
        // Runnable runnable = () -> System.out.println("Hello World from thread: " + Thread.currentThread().getName());
        // Thread thread = new Thread(runnable);
        // thread.start();

        // OR

        // In Java, we can only replace a Functional Interface with an Anonymous Function or a Lambda Function
        // Since Functional Interface has only 1 method, we can provide the behavior for that directly using a
        // Lambda Function in-line
        Thread thread = new Thread(() ->
                System.out.println("Hello World from thread: " + Thread.currentThread().getName())
        );
        thread.start();

        // Method Reference
        Future<String> value = Executors.newCachedThreadPool().submit(Runner::returnName);
        System.out.println(value.get());
    }

    private static String returnName() {
        System.out.println("Callable called");
        System.out.println("Thread: " + Thread.currentThread().getName());
        return "Tantia Tope";
    }
}
