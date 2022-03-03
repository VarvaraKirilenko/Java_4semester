package ru.mirea2.pr4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyExecutorService myExecutorService = new MyExecutorService(2);
        myExecutorService.submit(new MyRunnable());
        System.out.println(myExecutorService.submit(new MyCallable()).get());
        myExecutorService.shutdown();
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("one");
        }
    }

    static class MyCallable implements Callable {

        @Override
        public Object call() throws Exception {
            return "two";
        }

    }
}
