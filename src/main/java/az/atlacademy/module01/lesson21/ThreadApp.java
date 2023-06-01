package az.atlacademy.module01.lesson21;

public class ThreadApp {

    public static void main(String[] args) {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread name: " + Thread.currentThread().getName());
            }
        }
    }

}
