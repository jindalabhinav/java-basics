package Lambdas.RunnableWithAnonymousClass;

public class Runner {
    public static void main(String[] args) {
        // Anonymous Class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World from thread: " + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
