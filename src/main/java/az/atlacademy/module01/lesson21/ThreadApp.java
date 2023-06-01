package az.atlacademy.module01.lesson21;

public class ThreadApp {

    public static void main(String[] args) {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

        new Thread(new MyThread2()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread ID: " + Thread.currentThread().getId());

            }
        }).start();

        new Thread(() -> System.out.println("Thread ID: " + Thread.currentThread().getId())).start();

    }

    public static class MyThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread Name: " + Thread.currentThread().getName());
            }
        }

    }

    public static class MyThread2 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread ID: " + Thread.currentThread().getId());
            }
        }
    }

}

