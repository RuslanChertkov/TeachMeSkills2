package Lesson17.Multithreading5;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        Runnable printer = new PrintRunnable(" B", 500);
        Thread thread = new Thread(printer);
        thread.start();


        for (int k=0;k<10;k++){
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.printf("%s has been interrupted", Thread.currentThread().getName());
            }
            System.out.println("A");
        }
    }
}
