package Lesson17.Multithreading2;

public class Program {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        JThread t = new JThread("JThread");
        t.start();
        try{
            t.join();
        } catch (InterruptedException e) {
            System.out.printf("%s has been interrupted", t.getName());
        }
        System.out.println("Main thread finished");
    }
}
