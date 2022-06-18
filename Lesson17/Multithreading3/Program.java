package Lesson17.Multithreading3;

public class Program {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Thread MyThread = new Thread(new MyThread(), "MyThread");
        MyThread.start();
        try{
            MyThread.join();
        } catch (InterruptedException e) {
            System.out.printf("%s has been interrupted",MyThread.getName() );
        }
        System.out.println("Main thread finished");
    }
}
