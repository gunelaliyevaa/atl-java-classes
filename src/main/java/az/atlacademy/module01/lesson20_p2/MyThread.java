package az.atlacademy.module01.lesson20_p2;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        }
    }
}
